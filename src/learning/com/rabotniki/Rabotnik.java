package learning.com.rabotniki;

public class Rabotnik {
    int koef;
    int hourlyrate;
    static int vkof = 10;

    public Rabotnik(int koef, int hourlyrate){
        this.koef = koef;
        this.hourlyrate = hourlyrate;
    }

    public int zarplata(int time1){
        return hourlyrate * time1 + koef;
    }
    public static int zp(int time){
        return time * vkof;
    }
}