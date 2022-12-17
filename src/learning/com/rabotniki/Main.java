package learning.com.rabotniki;

public class Main {
    public static void main(String[] args) {
        Rabotnik chert = new Rabotnik(1, 500, 6);
        Rabotnik ivan = new Rabotnik(2, 500, 7);
        System.out.println(chert.zarplata());
        System.out.println(ivan.zarplata());
    }
}
