package learning.com;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class QueueFile {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy.k.m.s.S");
        File f = new File("C:\\File\\File1.txt");
        Calendar date = new GregorianCalendar();
        try (BufferedWriter br = new BufferedWriter(new FileWriter(f))){
            f.createNewFile();
            String str = df.format(date.getTime());
            br.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String str = br.readLine();
            String[] strings = str.split("\\.");
            date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(strings[0]));
            date.set(Calendar.MONTH, Integer.parseInt(strings[1]));
            date.set(Calendar.YEAR, Integer.parseInt(strings[2]));
            date.set(Calendar.HOUR, Integer.parseInt(strings[3]));
            date.set(Calendar.MINUTE, Integer.parseInt(strings[4]));
            date.set(Calendar.SECOND, Integer.parseInt(strings[5]));
            date.set(Calendar.MILLISECOND, Integer.parseInt(strings[6]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
