package oop;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianExample {
    public static void main(String[] args) {

       GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Just object:" + gc);

// y m d

        GregorianCalendar ymd = new GregorianCalendar(2062, 9, 29);
        System.out.println("Print" + ymd);

        // yMd - drugi konstruktor

        GregorianCalendar yMd = new GregorianCalendar(2022, Calendar.SEPTEMBER, 29);
        System.out.println("Print " + yMd);

        //treci konstr.

        GregorianCalendar wholeFDate = new GregorianCalendar(2088,8, 29, 6,12, 33);
        System.out.println("Print whole date: " + wholeFDate);


        int month = wholeFDate.get(Calendar.MONTH);
        int year = wholeFDate.get(Calendar.YEAR);
        int day = wholeFDate.get(Calendar.DAY_OF_MONTH);
        int hour = wholeFDate.get(Calendar.HOUR);
        int minutes = wholeFDate.get(Calendar.MINUTE);
        int seconds = wholeFDate.get(Calendar.SECOND);

        System.out.println("Exact date is: " +  day +"." + month + "." + year + " " + hour + ":" + minutes + ":" +
                "" + seconds );


       GregorianCalendar deadline = new GregorianCalendar();
        deadline.set(2022, Calendar.MAY, 5);
        System.out.println("Deadline is:" + deadline);


        System.out.println("Deadline: " + deadline.getTime());
        deadline.add(Calendar.DATE,5);
        System.out.println("New deadline " + deadline.getTime() );
        deadline.add(Calendar.DATE, -10);
        System.out.println("New deadline " + deadline.getTime());

    }


//current calendar.java



}
