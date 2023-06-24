package learning.com;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileDate {
    public static void main(String[] args) throws IOException {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        File f = new File("../Users/daniilbojkov/Downloads");
        try{
            f.createNewFile();
        }catch (Exception e){
            System.out.println("MLGLOL");
        }
    }
}
