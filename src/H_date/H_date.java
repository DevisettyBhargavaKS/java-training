package H_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_date {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/yyyy-E");
        System.out.println(formatdate.format(date));
    }
}
