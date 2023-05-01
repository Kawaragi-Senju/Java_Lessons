package learning.com.calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Dsada {
    Locale region;

    public void locale(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Region?\n 1-Europe\n 2-Asia\n 3-Africa\n 4-South America");
        switch(sc.nextLine()){
            case "1":
                region = Locale.GERMANY;
                break;
            case "2":
                region = Locale.JAPAN;
                break;
            case "3":
                region = Locale.ENGLISH;
                break;
            case "4":
                region = Locale.FRANCE;
                break;
            default:
                System.out.println("Error");

        }
    }

    public void showDate() throws Exception{
        if(region == null){
            throw new Exception("region is null((");
        }else{
            DateFormat dt = new SimpleDateFormat("yyyy-MMM-EEEE", region);
            Calendar date = new GregorianCalendar();
            System.out.println(dt.format(date.getTime()));
        }
    }
}
