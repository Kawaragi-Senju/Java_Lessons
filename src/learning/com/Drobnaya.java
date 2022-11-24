package learning.com;

public class Drobnaya {
    public static void main(String[] args) {
        float r = 1022.54f; //or another number
       int t = (int)r;
        if (t == r){
            System.out.println("нет дробной части");
        }else{
            System.out.println("дробная часть");
        }
    }
}

