package learning.com.queue;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Clock;
import java.time.LocalTime;
import java.util.*;

public class Server {
    private static final int CAPACITY = 10;
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

    private void blockUnblock(Account account, boolean bool){
        account.setActivity(bool);
    }

    private void passingWritedown(Account ac, int summ){
        if(ac.isActivity()){
            ac.setCash(ac.getCash() + summ);
        }
    }

//    private void notifyClients(boolean bool){
//       Iterator<Client> clientIterator = clientsList.iterator();
//       while(clientIterator.hasNext()){
//           clientIterator.next().setReady(bool);
//       }
//    }

    public void completeRequests(){
        while(queue.size() != 0){
            Request r = queue.poll();
            switch (r.getRequestType()) {
                case BLOCK :
                    blockUnblock(r.getAccount(), false);
                    break;
                case UNBLOCK:
                    blockUnblock(r.getAccount(), true);
                    break;
                case PASSING:
                    passingWritedown(r.getAccount(), r.getSum() );
                    break;
                case WRITEDOWN:
                    passingWritedown(r.getAccount(), - r.getSum());
                    break;
            }
        }
    }

    public void fileReader(){
        LocalTime t = LocalTime.now().plusMinutes(1);
        File file = new File("../../Requests");
        while (LocalTime.now().isBefore(t)){
            if(file.list().length != 0){

            }
        }
    }

    public Request readRequest(String fileName){
        String[] strings;
        String str = "";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            Request request = new Request();
            for(int i = 0; i < 4; i++){
                str = br.readLine();
                strings = str.split(" ");
                switch (strings[0]){
                    case "account":
                        request.setAccount(listOfAccount(Integer.parseInt(strings[1])));
                        break;
                    case "sum":
                        request.setSum(Integer.parseInt(strings[1]));
                        break;
                    case "requestType":
                        request.setRequestType(convertRequestType(strings[1]));
                        break;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("fnf");
        }catch (IOException ioException){
            System.out.println("ioe");
        }
    }
        public Account listOfAccount(int i){
            for(Account a:accountList){
                if (i == a.getAccount_number()){
                    return a;
                }
            }
            return null;
        }

        public RequestType convertRequestType(String string){
            switch (string){
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
}
//account 1000
// сделать считывание для календаря!!!
//Сохранить список, если список не пустой, то пришел запрос, надо выполнить запросы, читаем файлы и создаем запрос. todo
//дописать свитч кейс с аккуаунтом

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