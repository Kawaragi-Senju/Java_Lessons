package learning.com.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Server {
    private static final int CAPACITY = 10;
    private List<Account> list = new ArrayList<>();
    private PriorityQueue<Request> queue = new PriorityQueue<>(new RequestComparator());
    private List<Client> clientsList = new ArrayList<>();

    public void addClient(Client client){
        clientsList.add(client);
    }

    public void addRequest(Request request) {
        if (queue.size() < CAPACITY){
            queue.add(request);
        }else{
            //todo
            //natify client
        }
    }

    public void completeRequests(){
        while(queue.size() != 0){

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