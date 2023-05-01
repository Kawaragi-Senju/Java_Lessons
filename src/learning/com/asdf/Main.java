package learning.com.asdf;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Chelovek nsa = new Chelovek();
        Chelovek sda = new Chelovek();
        nsa.setAge(new Date(2001, Calendar.SEPTEMBER, 22));
        sda.setAge(new Date(2001, Calendar.APRIL, 12));

        nsa.checkAge();
        sda.checkAge();

    }

}
