package learning.com;

import java.util.Scanner;

public class Deliteli {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введем число");
        int z = vvod.nextInt();
        chisla(z);
    }

    static boolean chisla(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        return true;
    }
}