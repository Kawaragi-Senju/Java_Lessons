package learning.com.Circus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        Circus odin = new Circus(vvod.nextInt());
        System.out.println(odin.showsquare());
     }
}
//1. Создать класс Circus (Круг) с полем square (площадь) конструктор которого принимает
//радиус круга. Определить в классе метод showSquare(), выводящий на экран площадь
//круга. Создать массив элементов класса Circus, вывести на экран их площадь. S = ПR 2