package specials.polymorphic.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Test1 {

    public static void main(String[] args) {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        int date1 = Calendar.DATE;
        System.out.println(date1);

    }
}
