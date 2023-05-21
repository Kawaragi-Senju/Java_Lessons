package learning.com.queue;

import java.util.Calendar;

public class Request {


    private int sum;
    private long numberOfAccount;
    private Calendar calendar;
    private RequestType requestType;

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

    public long getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(long numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
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
