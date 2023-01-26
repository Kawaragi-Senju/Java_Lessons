package learning.com.zdfzc;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(Month.JANUARY, Month.SEPTEMBER, Month.FEBRUARY));
    }
    static int calculate(Month ... months){
        int p = 0;
        Month[] a = Month.values();
        for (Month month : a) {
            if (!searchMounth(month, months)) {
                System.out.println(month);
            }else{
                p += month.zp;
            }
        }
        return p;
    }

    public static boolean searchMounth(Month month, Month[] months){
        for (Month value : months) {
            if (month == value) {
                return true;
            }
        }
        return false;
    }
}
