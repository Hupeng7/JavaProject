package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Administrator
 * @date 2018/2/23 0023
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MARCH) + 1);
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("GregorianCalendarDemo");
        String[] months = {"Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};

        int year;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.print("Date: ");
        System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));

        System.out.print("Time: ");
        System.out.print(gregorianCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gregorianCalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        if (gregorianCalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }

        System.out.println(c.get(Calendar.YEAR) + "-"
                + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DATE));
        c.set(2010, 1, 0);
        System.out.println(c.get(Calendar.YEAR)
                + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DATE));




    }
}
