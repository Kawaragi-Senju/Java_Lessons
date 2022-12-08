package learning.com;

public class Mass {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    static int fact(int n){
    int s = 1;
    for (int i = 1; i <= n; i++){
        s *= i;
    }
    return s;
    }
}