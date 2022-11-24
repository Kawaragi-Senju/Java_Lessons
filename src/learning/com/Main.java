package learning.com;

public class Main {
    public static void main(String[] args) {
        int x = 121;
        int d = x*x+21*x-4;
        if (d%2 == 0) {
            System.out.println("число четное");
        }
        else{
            System.out.println("число нечетное");
        }
    }
}