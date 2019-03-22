package com.pig20190319.grainger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest3 {
    public static void main(String[] args) throws ParseException{
        String str="2012-5-27";

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");

        Date date =sdf.parse(str);

        //Calendar calendar = Calendar.getInstance();

        //calendar.setTime(date);

        System.out.println(date);
    }
}
