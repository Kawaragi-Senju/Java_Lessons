package learning.com;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число не превышающее 8 по вертикале и по горизонатли");
        int HorPoseVer = vvod.nextInt();
        int HorPoseGor = vvod.nextInt();
        int horse = HorPoseVer * 10 + HorPoseGor;
        System.out.println("Позиция коня = " + horse );
        int[][] m = new int[8][8];
        for (int i = 0; i <= m.length; i++) {
            if(HorPoseGor + i <= 6 ){
                HorPoseGor = HorPoseGor + 2;
            }else{
                HorPoseGor = HorPoseGor + 1;
            }

            for (int j = 0; j <= m[0].length; j++) {
                if(HorPoseVer + j <= 6 ){
                    HorPoseVer = HorPoseVer + 2;
                }else{
                    HorPoseVer = HorPoseVer + 1;
                }
            }
            System.out.println("Возможный ход  = " + HorPoseVer + HorPoseGor);
        }
    }
}