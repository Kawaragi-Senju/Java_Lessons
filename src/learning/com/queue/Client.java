package learning.com.queue;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Client {
    private List<Account> list = new ArrayList<>();
    private int counter = -1;

    private String name;

//    private boolean ready;

    public Client(String name){
        Account acc = new Account();
        Account acc1 = new Account();
        Account acc2 = new Account();
        list.add(acc);
        list.add(acc1);
        list.add(acc2);
    }
    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }
//
//    public boolean isReady() {
//        return ready;
//    }
//
//    public void setReady(boolean ready) {
//        this.ready = ready;
//    }
    public Request generateRequest(){
        Random random = new Random();
        int i = 0;
        i = random.nextInt(4);
        RequestType type = null;
        if (i == 0){
            type = RequestType.BLOCK;
        }if (i == 1){
            type = RequestType.UNBLOCK;
        }if (i == 2){
            type = RequestType.PASSING;
        }if (i == 3){
            type = RequestType.WRITEDOWN;
        }
        return new Request(random.nextInt(1000), list.get(random.nextInt(list.size())), new GregorianCalendar(), type);
    }

    public String generateFileName(){
        return name + "_" + counter++;
    }

    public void toFile(Request request){
        try {
            FileWriter fr = new FileWriter(Server.REQUEST_FOLDER.toString() + generateFileName());
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write("account " + String.valueOf(request.getAccount().getAccount_number()));
            bw.write("Sum " + request.getSum());
            bw.write("RequestType " + request.getRequestType());
            bw.write("Calendar " + request.getCalendar());
        }catch (IOException ie){
            System.out.println("IoException");
        }
    }

    public String
    DateFormat df = new SimpleDateFormat("dd.MM.yyyy.k.m.s.S");
}
//Клиент – это класс, состоящий из следующих полей:
//        Счета – список счетов, с которыми работает клиент
//        id – уникальный идентификатор, целое число
//        Готовность сервера – true если клиент получил информацию о том, что сервер принимает запросы и false,  если нет.
//        У Клиента должны быть следующие методы:
//        Зарегистрироваться у сервера – вызвать у сервера метод, добавляющий клиента в список клиентов. Так же при вызове этого метода,
//        сервер сохраняет у себя счета, с которыми работает клиент.
//        Отправить запрос – создать запрос и отправить его серверу. В созданном запросе  поля «вид запроса» и «сумма» генерируется случайным образом,
//        но сумма должна быть меньше 1000.
//        Поле «номер счета» должно содержать один из  номеров списка счетов клиента.  Возвращает true, если сервер получил запрос.
//        Если сервер не принимает запросы (т.е. готовность сервера == false), то метод возвращает  false.
//        Оповестить о готовности – метод вызывается, чтобы сказать клиенту, что сервер готов принимать запросы.
//        Оповестить о неготовности  – метод вызывается, чтобы сказать клиенту, что сервер не готов принимать запросы.