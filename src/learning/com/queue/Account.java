package learning.com.queue;

import java.util.Random;

public class Account {
    private int account_number;
    private int cash = 1000000;
    private boolean activity;

    public Account(){
        Random random = new Random();
        this.account_number = random.nextInt(Integer.MAX_VALUE);
    }

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
    @Override
    public String toString(){
        return String.valueOf(account_number);
    }
}
//Счет – это класс, у которого есть следующие поля:
//        номер счета – целое число
//        сумма – кол-во денег на счете, изначально равняется 1 млн.
//        активность счет – Boolean, если поле равно false,  значит он заблокирован и списание/зачисление запрещено.