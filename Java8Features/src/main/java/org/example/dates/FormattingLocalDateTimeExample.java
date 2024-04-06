package org.example.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class FormattingLocalDateTimeExample {
    //String to LocalDateTime
    public static void parseLocalDateTime(){
        String dateTime = "2022-04-21T12:30:30";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime " + localDateTime);

        LocalDateTime  localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1 " + localDateTime1);

        /*
            Custom Defined Date Time Format
         */

        String dateTime2  =  "2022/12/04TT15|30|20";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'TT'HH|mm|ss");
        LocalDateTime   localDateTime2  = LocalDateTime.parse(dateTime2,  dateTimeFormatter);
        System.out.println("localDateTime2 "  + localDateTime2);



    }

    //LocalDateTime to String
    public static void formatLocalDateTime(){
        LocalDateTime  localDateTime  =  LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'hh|mm|ss a");
        String formattedLocalDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("formattedLocalDateTime   " + formattedLocalDateTime);

    }
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
