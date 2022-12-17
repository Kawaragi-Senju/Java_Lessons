package learning.com.rabotniki;

public class Rabotnik {
    int id;
    int hourlyrate;
    int time;

    public Rabotnik(int id, int hourlyrate, int time){
        this.id = id;
        this.hourlyrate = hourlyrate;
        this.time = time;
    }

    public int zarplata(){
        return hourlyrate * time;
    }
}