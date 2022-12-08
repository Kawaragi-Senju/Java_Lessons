package learning.com;

import java.util.Scanner;

public class Evkld_Alg {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите два числа");
        int x = vvod.nextInt();
        int y = vvod.nextInt();
        while ((x != 0) & (y != 0)){
            do if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }while(false);
        }
        System.out.println(x + y);
    }
}