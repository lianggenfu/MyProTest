package com.pig20190319.grainger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*获得指定日期的后num天*/

public class CalendarTest {
    private static int num=10;

    public static void main(String[] args) {
        String specialDay = "2017-10-23";
        Calendar c = Calendar.getInstance();
        //Date date=new Date();
        Date date=null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specialDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+num);

        String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
        System.out.println(dayAfter);
       // return dayAfter;
    }
}
