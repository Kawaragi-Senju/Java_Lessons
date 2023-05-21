package learning.com.queue;

public class Account {
    private int account_number;
    private int cash = 1000000;
    private boolean activity;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
//Счет – это класс, у которого есть следующие поля:
//        номер счета – целое число
//        сумма – кол-во денег на счете, изначально равняется 1 млн.
//        активность счет – Boolean, если поле равно false,  значит он заблокирован и списание/зачисление запрещено.