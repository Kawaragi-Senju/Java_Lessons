package learning.com.rabotniki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число часов ");
        Rabotnik ch = new Rabotnik(4, 5);
        System.out.println(Rabotnik.zp(scanner.nextInt()));
        System.out.println(ch);
    }
}
