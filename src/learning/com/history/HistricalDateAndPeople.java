package learning.com.history;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HistricalDateAndPeople extends HistoricalDate{
    String[] info;
    StringBuilder stringBuilder = new StringBuilder();


    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-EEEE");
        String format = dateFormat.format(date.getTime());
        stringBuilder.append(format);
        stringBuilder.append("\n");
        stringBuilder.append(dateDescription);
        stringBuilder.append("\n");
        stringBuilder.append("Related people: ");
        for(int i = 0; i < info.length; i++){
            stringBuilder.append("\n");
            stringBuilder.append(info[i]);
        }
       return stringBuilder.toString();
    }
}
