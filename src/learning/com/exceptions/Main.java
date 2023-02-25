package learning.com.exceptions;

public class Main {
    public static void main(String[] args) {
        foo();
    }

    static String metod(String str) throws Exception{
        if (str != null){
            return "Hello " + str;
        }
        throw new EmptyNameExeption();
    }

    static void foo(){
        try{
            System.out.println(metod(""));
        }catch(Exception e){
            System.out.println("Hello Noname");
        }finally {
            System.out.println("Program is over");
        }
    }
}
