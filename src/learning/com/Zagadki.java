package learning.com;

import  java.util.Random;
import java.util.Scanner;

public class Zagadki {
    public static void main(String[] args) {
        int numb;
        String vvodd;
        Scanner vvod = new Scanner(System.in);
        Random random = new Random();
        String[] zag = {"Висит груша нельзя скушать", "Зимой и летом одним цветом"};
        String[] otv = {"Лампочка", "Елка"};
        numb = random.nextInt(2);
        System.out.println(zag[numb]);
        do {
            vvodd = vvod.nextLine();
            if (!otv[numb].equals(vvodd)) {
                System.out.println("Подумай еще");
            }
        }
        while (!vvodd.equals(otv[numb]));
        System.out.println("Right");
    }
}