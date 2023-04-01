package learning.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx{
//    public static void main(String[] args) {
//        String mail = "dnfms_fksa12@mail.ewe";
//        try {
//            check(mail);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//
//    private static void check(String s) throws Exception{
//        String pattern = "[a-z]\\w+@[a-z]+\\.[a-z]+";
//        if(!s.matches(pattern)){
//            throw new Exception("Non format");
//        }else{
//            System.out.println("Email saved");
//        }
//    }

    public static void main(String[] args) {
        String sad = "Hello   World   Rasffg";
        spaces(sad);

    }

    static void spaces(String s){
        Pattern pattern1 = Pattern.compile("\\s{2,}");
        Matcher m = pattern1.matcher(s);
        while(m.find()){
            System.out.println(m.start());
        }
    }
}
//replaceall() с помощью этого