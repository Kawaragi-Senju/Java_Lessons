package learning.com.queue;

import java.util.Calendar;

public class Request {


    private int sum;

    private Account account;
    private Calendar calendar;
    private RequestType requestType;

    public Request(int sum, Account account, Calendar calendar, RequestType requestType){
        this.sum = sum;
        this.account = account;
        this.calendar = calendar;
        this.requestType = requestType;
    }

    public Request(){

    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString(){
        StringBuffer str = new StringBuffer();
        return String.valueOf(str.append("Summa = ").append(sum).append("\n").append("account_number = ").append(account ).append("\n").append(calendar ).append("\n").append(requestType ));
    }

}
//    Вид запроса – перечисление со следующими значениями:
//        WRITEDOWN – списание средств со счета
//        PASSING – зачисление средств на счет
//        BLOCK – блокирование счета
//        UNBLOCK – разблокирование счета
//        Сумма – денежная сумма, которую необходимо списать или зачислить на счет (в зависимости от вида запроса).
//        Если вид запроса  - BLOCK или UNBLOCK, это поле игнорируется.
//        Номер счета
//        Дата создания запроса (включая час, минуты и секунды)
