package learning.com.pryamougol;

public class Sqare {
    public static void main(String[] args) {
       Prymougol [] pr = new Prymougol[10];
        for (int i = 0; i < pr.length; i++){
            pr[i] = new Prymougol(i + 5, i * 4);
            System.out.println(pr[i].sq());
        }
    }
}
