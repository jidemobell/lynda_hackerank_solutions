package com.mobell;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by prinm on 3/29/2017.
 */
public class DateTiming {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate id = LocalDate.of(2009,10,21);
        System.out.println(id);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(id));
    }

}
