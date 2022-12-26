package learning.com.rabotniki2;

import java.util.Scanner;

public class RabotnikMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float minKoef = scanner.nextFloat();
        Rabotnik rab = new Rabotnik(5000);
        RabotnikBiohazard rabBio = new RabotnikBiohazard(20, 5000);
        Trainee trainee = new Trainee(5000, 0.4f);
        System.out.println(Rabotnik.zp(5));
        System.out.println(RabotnikBiohazard.zp(20, 5));
        if(minKoef * 0.01 < 1){
            System.out.println(Trainee.zp(minKoef, 5));
        }else{
            System.out.println("понижающий коэффициент задан неправильно!");
        }
    }
}
