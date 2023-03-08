package learning.com;

import java.io.*;

public class Fileread {
    public static void main(String[] args){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\File\\file.txt")))){
        String str = bufferedReader.readLine();
        while(str != null){
                System.out.println(str);
                str = bufferedReader.readLine();
        }
    }catch (Exception e){
            System.out.println("Error");
        }
    }
}
