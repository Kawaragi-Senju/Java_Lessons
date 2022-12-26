package learning.com.car;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        System.out.println("how far did the car drived?");
        Scanner scanner = new Scanner(System.in);
        float km = scanner.nextFloat();
        byte drived = (byte) ((km/100) * 8.5);
        System.out.println(Car.spendFuel(drived));
        System.out.println(Car.showRemaningFuel(Car.tankVolume, drived));
        System.out.println(Car.showTankVolume());
    }
}
