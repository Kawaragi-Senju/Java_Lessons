package learning.com.queue;

import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class Server {

    private static final int CAPACITY = 10;

    public static final File REQUEST_FOLDER = new File("C:\\File");
    private List<Account> accountList = new ArrayList<>();
    private PriorityQueue<Request> queue = new PriorityQueue<>(new RequestComparator());

    //private List<Client> clientsList = new ArrayList<>();

//    public void addClient(Client client){
//        clientsList.add(client);
//    }

    public void addRequest(Request request) {
        System.out.println("Request confirmed");
        System.out.println(request);
        queue.add(request);
        if (queue.size() == CAPACITY) {
            completeRequests();
        }
    }

    private void blockUnblock(Account account, boolean bool) {
        account.setActivity(bool);
    }

    private void passingWritedown(Account ac, int summ) {
        if (ac.isActivity()) {
            ac.setCash(ac.getCash() + summ);
        }
    }

//    private void notifyClients(boolean bool){
//       Iterator<Client> clientIterator = clientsList.iterator();
//       while(clientIterator.hasNext()){
//           clientIterator.next().setReady(bool);
//       }
//    }

    public void completeRequests() {
        while (queue.size() != 0) {
            Request r = queue.poll();
            switch (r.getRequestType()) {
                case BLOCK:
                    blockUnblock(r.getAccount(), false);
                    System.out.println("block +");
                    break;
                case UNBLOCK:
                    blockUnblock(r.getAccount(), true);
                    System.out.println("unblock +");
                    break;
                case PASSING:
                    passingWritedown(r.getAccount(), r.getSum());
                    System.out.println("pass +");
                    break;
                case WRITEDOWN:
                    passingWritedown(r.getAccount(), -r.getSum());
                    System.out.println("writedown +");
                    break;
            }
        }
    }

    public void fileReader() {
        LocalTime t = LocalTime.now().plusMinutes(1);
        while (LocalTime.now().isBefore(t)) {
            String[] fileNames = REQUEST_FOLDER.list();
            if (fileNames.length != 0) {
                for(int i = 0; i < fileNames.length; i++){
                queue.add(readRequest(fileNames[i]));
                }
                completeRequests();
            }
        }
    }

    public Request readRequest(String fileName) {
        File file = new File(REQUEST_FOLDER.toString() + "\\" + fileName);
        String[] strings;
        String str = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            Request request = new Request();
            for (int i = 0; i < 4; i++) {
                str = br.readLine();
                strings = str.split(" ");
                switch (strings[0]) {
                    case "Account":
                        request.setAccount(findAccountByID(Integer.parseInt(strings[1])));
                        break;
                    case "Sum":
                        request.setSum(Integer.parseInt(strings[1]));
                        break;
                    case "RequestType":
                        request.setRequestType(convertRequestType(strings[1]));
                        break;
                    case "Date":
                        request.setCalendar(showDate(strings[1]));
                        break;
                }
            }
            file.delete();
            return request;
        } catch (FileNotFoundException e) {
            System.out.println("fnf");
        } catch (IOException ioException) {
            System.out.println("ioe");
        }
        return null;
    }

    public Account findAccountByID(int i) {
        for (Account a : accountList) {
            if (i == a.getAccount_number()) {
                return a;
            }
        }
        return null;
    }

    public RequestType convertRequestType(String string) {
        switch (string) {
            case "WRITEDOWN":
                return RequestType.WRITEDOWN;
            case "PASSING":
                return RequestType.PASSING;
            case "BLOCK":
                return RequestType.BLOCK;
            case "UNBLOCK":
                return RequestType.UNBLOCK;
        }
        return null;
    }

    public Calendar showDate(String str) {
        Calendar date = new GregorianCalendar();
            String[] strings = str.split("\\.");
            date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(strings[0]));
            date.set(Calendar.MONTH, Integer.parseInt(strings[1]));
            date.set(Calendar.YEAR, Integer.parseInt(strings[2]));
            date.set(Calendar.HOUR, Integer.parseInt(strings[3]));
            date.set(Calendar.MINUTE, Integer.parseInt(strings[4]));
            date.set(Calendar.SECOND, Integer.parseInt(strings[5]));
            date.set(Calendar.MILLISECOND, Integer.parseInt(strings[6]));
        return date;
    }

    public File showInFolder() {
        String[] pathnames;
        pathnames = REQUEST_FOLDER.list();
        for (String fileName : pathnames) {
            System.out.println(fileName);
        }
        return null;
    }

    public void delete(File file){
        file.delete();
    }

    public void addAccount(List<Account> clientsList){
        accountList.addAll(clientsList);
    }
}
//account 1000

//Сделать закрытыие, удаление и вызват метод реквест в мейне, доавлять реквесты в очередь!!! TODO
//Чтение папки с файлом, цикл работает около 1000 раз, заходит в директорию смотрит файлы, читает, парсит, порождает реквесты и ставит в очередь.
// метод лист отдает масив имен файлов в папке, файл.лист.



// «Сервер» это класс со следующими полями:
//        Счета – список банковских счетов.
//        Очередь – приоритетная очередь запросов. Инициализируются с помощью интерфейса Comparator. Запросы располагаются в очереди по следующему принципу:
//        Запросы, пришедшие раньше, должны выполняться раньше, но BLOCK и UNBLOCK  - исключение. Эти запросы должны выполниться раньше остальных.
//        Клиенты – список клиентов
//        У сервера есть следующие методы:
//        Зарегистрировать клиента – добавить нового клиента в список клиентов.
//        Принять запрос – принять запрос от клиента. Если после принятого запроса очередь заполнена, сервер оповещает клиентов о том, что запросы не принимаются.
//        Оповестить о готовности принимать запросы
//        Выполнить запросы
//        Оповестить о неготовности принимать запросы