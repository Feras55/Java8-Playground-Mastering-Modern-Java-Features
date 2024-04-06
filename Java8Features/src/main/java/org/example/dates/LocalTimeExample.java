package org.example.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Local time now: " + localTime);

        System.out.println("of hour minutes: " + LocalTime.of(20,16));
        System.out.println("of hour minutes seconds: " + LocalTime.of(20,16,23));
        System.out.println("of hour minutes seconds nano seconds: " + LocalTime.of(20,16,23,11225));

        /*
          Get values from local time instance
         */

        System.out.println("Get Hour: " + localTime.getHour());
        System.out.println("Get minute: " + localTime.getMinute());
        System.out.println("Get CLOCK_HOUR_OF_DAY: " +
                localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("to Second Of Day: " +
                localTime.toSecondOfDay());

        /*
            Modify values of local time
         */
        System.out.println("Minus hours: " + localTime.minusHours(2));
        System.out.println("Minus hours TemporalUnit: " + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("MIDNIGHT: " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR OF DAY: " + localTime.with(ChronoField.HOUR_OF_DAY, 22));
        System.out.println("Plus Minutes: " + localTime.plusMinutes(30));

    }
}
