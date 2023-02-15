package learning.com;

public class StTest {
    public static void main(String[] args) {
        String s = "ABCCBA";
        System.out.println(pol(s));
    }

    static boolean pol(String s){
        if(s == null){
            return false;
        }
        for (int i = 0; i <= s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}