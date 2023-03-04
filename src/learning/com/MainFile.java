package learning.com;

import java.io.File;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args){
        File file = new File("../character/characterDescription.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("not exist");
            }
        }else{
            for(File a : file.getParentFile().listFiles()){
                if(!file.equals(a)){
                    a.delete();
                }
            }
        }
    }
}