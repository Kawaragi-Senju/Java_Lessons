package learning.com;

public class ZadMass {
    public static void main(String[] args) {
    int[] a = {1, 7, 9, 5 ,3};
        System.out.println(mass(a));
    }
    static boolean mass(int[] m){
        for(int i = 0; i < m.length; i++){
            if(m[i] % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
