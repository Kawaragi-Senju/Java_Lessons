package learning.com.rabotniki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число часов ");
        System.out.println(Rabotnik.zp(scanner.nextInt()));
    }
}
