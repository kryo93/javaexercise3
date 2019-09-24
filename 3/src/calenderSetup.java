import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderSetup
{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yy");
        System.out.println(df.format(cal.getTime()));
        for(int i=0;i<6;i++) {
            cal.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(cal.getTime()));

    }

}
