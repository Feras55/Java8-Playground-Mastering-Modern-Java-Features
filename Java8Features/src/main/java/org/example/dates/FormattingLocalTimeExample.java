package org.example.dates;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    //String to LocalTime
    public static void parseLocalTime(){
        String time =  "12:30";
        LocalTime  localTime = LocalTime.parse(time);
        System.out.println("localTime " + localTime);

        LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("localTime1 " +  localTime1);
        /*
            Custom Defined Time Format
         */

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime  localTime2 = LocalTime.parse(time,dateTimeFormatter);
        System.out.println("localTime2 " +  localTime2);

    }

    //LocalTime to String
    public static void formatLocalTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime localTime =  LocalTime.now();
        String formattedLocalTime = localTime.format(dateTimeFormatter);
        System.out.println("formattedLocalTime "  +  formattedLocalTime);

    }
    public static void main(String[] args) {
        parseLocalTime();
        formatLocalTime();
    }
}
