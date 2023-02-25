package learning.com.exceptiondz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String a = scanner.nextLine();
        try{
            calculate(a);
        }catch (IllegalOperatorException e){
            System.out.println("IllegalOperatorException");
        }catch(NumberFormatException e1){
            System.out.println("NumberFormatException");
        }catch(LengthException e2){
            System.out.println("LengthException");
        }
        finally {
            System.out.println("Program is over");
        }
    }

    private static void calculate(String a) throws LengthException, NumberFormatException, IllegalOperatorException{
        if(a.length() != 5){
            throw new LengthException("length != 5");
        }
        String s = a.substring(0, 2);
        String s1 = a.substring(3, 5);
        String s2 = a.substring(2, 3);
        if(!s.matches("\\d{2}")){
            throw new NumberFormatException("Number format is wrong");
        }
        if(!s1.matches("\\d{2}")){
            throw new NumberFormatException("Number format is wrong");
        }
        int chis = Integer.parseInt(s);
        int chis1 = Integer.parseInt(s1);
        switch (s2){
            case "*":
                System.out.println(chis1 * chis);
                break;
            case "/":
                System.out.println(chis1 / chis);
                break;
            case "+":
                System.out.println(chis1 + chis);
                break;
            case "-":
                System.out.println(chis1 - chis);
                break;
            default:
                throw new IllegalOperatorException("IllegalOperator");
        }

        int b = Integer.parseInt(a.substring(0, 2));
    }
}
//12*32