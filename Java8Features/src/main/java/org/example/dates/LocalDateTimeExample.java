package org.example.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time: " + localDateTime);

        System.out.println("Local Date Time2: " + LocalDateTime.of(
                2022,12,20,22,15,30,23222
        ));

        System.out.println("Local Date Time3: " +LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        /*
               Get Values from LocalDateTime instances
         */

        System.out.println("Get Hours: " + localDateTime.getHour());
        System.out.println("Get Minute: " + localDateTime.getMinute());
        System.out.println("Get Day Of Month: " + localDateTime.getDayOfMonth());
        System.out.println("Get Day Of Month using with TemporalField: " + localDateTime.get(ChronoField.DAY_OF_MONTH) );

        /*
                Modifying LocalDateTime
         */

        System.out.println("plusHours: " + localDateTime.plusHours(2));
        System.out.println("minusDays: " + localDateTime.minusDays(2));
        System.out.println("withMonth: " + localDateTime.withMonth(2));

        //Converting localDate, localTime to localDateTime and Viceversa

        LocalDate localDate = LocalDate.of(2022,10,12);
        System.out.println("atTime: " + localDate.atTime(12,5,23));

        LocalTime  localTime = LocalTime.of(12,5,23);
        System.out.println("atDate: " + localTime.atDate(localDate));

        LocalDateTime localDateTime1 =  LocalDateTime.now();
        System.out.println("toLocalDate: " + localDateTime1.toLocalDate());
        System.out.println("toLocalTime: " + localDateTime1.toLocalTime());
    }
}
