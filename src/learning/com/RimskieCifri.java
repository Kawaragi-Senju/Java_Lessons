package learning.com;

import java.util.Scanner;

public class RimskieCifri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введит Римскую цифру, которую хототие переделать в Арабскую");
        char rim = scanner.nextLine().charAt(0);
        convert(rim);
    }
    public static char convert(char x){
        switch (x){
            case 'I':
                System.out.println("I = 1");
                break;
            case 'V':
                System.out.println("V = 5");
                break;
            case 'X':
                System.out.println("X = 10");
                break;
            case 'L':
                System.out.println("L = 50");
                break;
            case 'C':
                System.out.println("C = 100");
                break;
            case 'D':
                System.out.println("D = 500");
                break;
            case 'M':
                System.out.println("M = 1000");
                break;
            default:
                System.out.println(-1);
        }
        return 0;
    }
}
//I = 1, V = 5, X = 10, L = 50, C = 100, D = 500 M = 1000