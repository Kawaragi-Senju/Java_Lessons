package learning.com;

public class MassiveDvum {
    public static void main(String[] args) {
        int [][] m = new int[3][3];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if(i + j >= 2){
                    m[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* 00 01 02
   10 11 12
   20 21 22*/