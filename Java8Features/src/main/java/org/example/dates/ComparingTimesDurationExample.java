package org.example.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);

        System.out.println("Diff: " + localTime.until(localTime1, ChronoUnit.MINUTES));
        Duration duration = Duration.between(localTime,localTime1);
        System.out.println("Duration to minutes :  " + duration.toMinutes());

        Duration duration1 =  Duration.ofHours(2);
        System.out.println("ofHours: " + duration1.toHours());
    }
}
