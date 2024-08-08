package clase6;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class DateAndCalendar {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar" + calendar);
        System.out.println("date" + fecha);

        LocalDateTime ldt =LocalDateTime.now();
        System.out.println("LocalDateTime"+ldt);

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate " + localDate);



    }
}
