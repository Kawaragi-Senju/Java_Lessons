package learning.com;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char cardmember = scanner.nextLine().charAt(0);
        int cardsuit = scanner.nextLine().charAt(0);
        String cardM;
        char cardS;
        final String j = "Валет";
        final String q = "Дама";
        final String k = "Король";
        final String a = "Туз";
        char t = '\u2663'; //Трефы
        char p = '\u2660'; //Пики
        char c = '\u2665'; //Черви
        char b = '\u2666'; //Бубны

        switch (cardmember) {
            case 'j':
                cardM = j;
                break;
            case 'q':
                cardM = q;
                break;
            case 'k':
                cardM = k;
                break;
            case 'a':
                cardM = a;
                break;
            default:
                cardM = null;
        }
        switch (cardsuit) {
            case 't':
                cardS = t;
                break;
            case 'p':
                cardS = p;
                break;
            case 'c':
                cardS = c;
                break;
            case 'b':
                cardS = b;
                break;
            default:
                cardS = 0;
        }
        System.out.print(cardM + cardS);
    }
}
