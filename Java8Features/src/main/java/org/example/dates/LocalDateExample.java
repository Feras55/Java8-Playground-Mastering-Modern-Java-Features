package org.example.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : " + localDate);

        System.out.println("Date of: "+LocalDate.of(2022,12, 3));
        System.out.println("Date of Year Day: "+LocalDate.ofYearDay(2022,321));
        /*
            Get Values from localDate
         */
        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfMonth: " + localDate.getDayOfMonth());
        System.out.println("Day of Month using get: " +
                localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());

        /**
         * Modifying Local Date
         */
        System.out.println("plusDays" + localDate.plusDays(2));
        System.out.println("plusMonths" + localDate.plusMonths(2));
        System.out.println("minusDays" + localDate.minusDays(2));
        System.out.println("minusDays" + localDate.minusDays(2));
        System.out.println("withYear" + localDate.withYear(2019));
        System.out.println("with ChronoField Year " +
                localDate.with(ChronoField.YEAR, 2019));
        System.out.println("with Temporal Adjusters " +
                localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit Minus " +
                localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Additional Support Method
         */
        System.out.println("Is Leap Year?: " + localDate.isLeapYear());
        System.out.println("Is Leap Year?: " + LocalDate.ofYearDay(2021,1).isLeapYear());
        System.out.println("Is Date Equal now date: " + localDate.isEqual(LocalDate.of(2024,3,23)));
        System.out.println("Is Date Before now date: " + localDate.isBefore(LocalDate.of(2024,3,23)));
        System.out.println("Is Date After now date: " + localDate.isAfter(LocalDate.of(2024,3,23)));

        /**
         * Unsupported operations
         */
//        System.out.println("Chronounit minus " +
//                localDate.minus(1,ChronoUnit.MINUTES)); //Throws Unsupported Unit Exception

        //To check whether operation is supported
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));


    }
}
