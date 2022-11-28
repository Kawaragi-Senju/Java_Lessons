package learning.com;

public class DvumMass2 {
    public static void main(String[] args) {
        int summ = 0;
        int [][] m = {{1, 2, 5},
                      {5, 10, 67},
                      {8, 45, 60}};
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if(i == j){
                    summ += m[i][j];
                }
            }
        }
        System.out.println(summ);
    }
}