package learning.com.calendar;

public class Main{
    public static void main(String[] args){
        Dsada dsada = new Dsada();
        dsada.locale();
        try {
            dsada.showDate();
        } catch (Exception e) {
            System.out.println("Region is null");
        }
    }
}
