package learning.com;

public class NaibolsheeChislo {
    public static void main(String[] args) {
        int naichislo = 0; //the biggest number
        int [] m = {23, 56, 65, 64, 89};
        for (int i = 0; i < m.length; i++){
            if (m[i] > naichislo){
                naichislo = m[i];
            }
        }
        System.out.println(naichislo);
    }
}
