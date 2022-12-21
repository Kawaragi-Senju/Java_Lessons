package learning.com.av;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double katet = vvod.nextDouble();
        double gipotenuz = vvod.nextDouble();
        //int m = vvod.nextInt();
        //System.out.println(Massa.m(m));
        System.out.println(Massa.sin(katet, gipotenuz));
    }
}
