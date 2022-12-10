package learning.com;
import java.math.*;

public class New {
    public static void main(String[] args) {
        chisla(4, 0, 100);
    }
    public static void chisla (int a, int b, int c){
        int d = b * b -4 * a * c;
        if(d < 0){
            System.out.println("Отриц Дискрименант");
            return;
        }
        double x1 = (-b + Math.sqrt(d)) / 2 * a ;
        double x2 = (-b - Math.sqrt(d)) / 2 * a ;
        System.out.println(x1 + " " +  x2);
    }
}
