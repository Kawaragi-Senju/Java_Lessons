package learning.com.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Server {
    private static final int CAPACITY = 10;
    private List<Account> list = new ArrayList<>();
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
}
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