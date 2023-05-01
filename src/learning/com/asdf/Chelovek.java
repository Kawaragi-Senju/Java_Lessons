package learning.com.asdf;

import java.util.Calendar;
import java.util.Date;

public class Chelovek {
    String name = "Sasha";
    private Date age;



    public void checkAge(){
        Date currentDate = new Date();
        int r = currentDate.getYear();
        if(r - age.getYear() >= 18){
            System.out.println(name + " full age");
        }else{
            System.out.println(name + " drink lemonade");
        }
    }

    public void setAge(Date age) {
        this.age = age;
    }


}