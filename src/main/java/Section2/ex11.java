package Chapter2;

import edu.princeton.cs.algs4.StdOut;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Public class date
public class ex11 {
    private final int month;
    private final int day;
    private final int year;
    enum daysOfWeek {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};

    public ex11(int m, int d, int y){

        month=m; day = d; year=y;
    }
    public int month(){
        return month;
    }

    public int day(){
        return day;
    }

    public int year(){
        return year;
    }

    public String daysOfWeek(int d,int m, int y){
        String[] days = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        Calendar calendar = Calendar.getInstance();
        String d1 = String.valueOf(d +"/" + m +"/"  + y);
        try{
            SimpleDateFormat format1 = new SimpleDateFormat("dd,MM,yyyy");
            Date date = format1.parse(d1);
            calendar.setTime(date);

        } catch (Exception e){
            System.out.println(e);
        }
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

   return days[dayOfWeek -1];
    }

    public boolean isDateValid(int d, int m, int y){

        //if()
        return false;
    }

    public static void main(String[] args){
        ex11 smartdate = new ex11(4,18,2020);
        StdOut.println(smartdate.daysOfWeek(19,10,2020));
    }
}
