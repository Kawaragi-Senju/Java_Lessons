package learning.com;

public class Massive {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 27;
        a[1] = 25;
        a[2] = 44;

        if(a[0] % 2 == 0 ){
            System.out.println("0");
        }
        else if(a[1] % 2 == 0){
            System.out.println("1");
        }
        else if(a[2] % 2 == 0){
            System.out.println("2");
        }
    }
}
