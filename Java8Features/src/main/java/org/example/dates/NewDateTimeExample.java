package org.example.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        System.out.println("Local Date: "  + LocalDate.now());
        System.out.println("Local Time: "  + LocalTime.now());
        System.out.println("Local Date Time "  + LocalDateTime.now());
    }
}
