import java.util.Calendar;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HourlyEmployee joe = new HourlyEmployee("Joe Worker", new Date(15, Calendar.JANUARY, 20), 50.50, 160);
        HourlyEmployee Zia = new HourlyEmployee("Joe Worker", new Date(15, Calendar.JANUARY, 20), 50.50, 160);
        SalariedEmployee Amanda = new SalariedEmployee("Amanda", new Date(16, Calendar.APRIL, 25), 90000.00);
        System.out.println(joe.getName());
        System.out.println(joe);
        System.out.println(Zia);
        System.out.println(Zia.equals(joe));
        System.out.println(joe.samePay(Zia));
        OrderedHourlyEmployee Sarah = new OrderedHourlyEmployee();
        OrderedHourlyEmployee Justin = new OrderedHourlyEmployee();
        System.out.println("Instance test " + Justin.precedes(Justin));
        System.out.println("Instance test " + Sarah.precedes(Zia));
        System.out.println("Instance test " + Justin.precedes(Justin));
        System.out.println(Sarah.getPay());
        System.out.println(Justin);
        System.out.println("testing Employee for git hub");
;    }
}