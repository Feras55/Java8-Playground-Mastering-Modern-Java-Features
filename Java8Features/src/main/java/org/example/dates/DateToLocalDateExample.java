package org.example.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        /*
               Java.Util.Date to LocalDate and Vice versa
         */

        Date  date  = new Date();
        System.out.println("java util  date:  " + date);

        LocalDate  localDate  = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Local Date: " + localDate);

        System.out.println("Converted  java util date: " +
                Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant()));
        /*
               Java.sql.Date to LocalDate and Vice versa
         */

        java.sql.Date date1 = java.sql.Date.valueOf(localDate);
        System.out.println("Converted sql.Date : " + localDate);

        System.out.println("Converted Local Date: " +
                date1.toLocalDate());
    }
}
