package learning.com;

public class StrTest {
    public static void main(String[] args) {
        String s = null;
        System.out.println(polyndrom(s));
    }

    static boolean polyndrom(String s){
        if (s == null){
            return false;
        }
        char[] s2 = new char[s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            s2[s2.length - i -1] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s2[i]) {
                return false;
            }
        }
        return true;
    }
}