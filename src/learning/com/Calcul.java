package learning.com;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        System.out.println("Введите операцию и числа : ");
        Scanner vvod = new Scanner(System.in);
        char i = vvod.nextLine().charAt(0);
        System.out.println(chis(vvod.nextInt(), vvod.nextInt(), i));
    }
    public static float chis(int a, int b, char operation){
        switch(operation){
            case '*':
               return a * b;
            case '/':
                return a / b;
            case '-':
                return a - b;
            case '+':
                return a + b;
            default:
                System.out.println("Error");
                return 0;
        }
    }
}
