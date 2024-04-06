package org.example.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalDateExample {

    //String to LocalDate
    public static void parseLocalDate(){
        String date = "2022-04-21";
        LocalDate localDate =  LocalDate.parse(date);
        System.out.println("localDate  "  + localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 " + localDate1);

        String date1 = "20220421";
        LocalDate localDate2 =  LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 "  +  localDate2);

        /*
            Custom Defined Date Format
         */

        String date2 = "2022|04|21";
        DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3  =  LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("localDate3 " + localDate3);

        String date3 = "2022*04*21";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 =  LocalDate.parse(date3,dateTimeFormatter1);
        System.out.println("localDate4 " + localDate4);
    }

    //LocalDate to String
    public static void formatLocalDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate date = LocalDate.now();
        String formattedLocalDate = date.format(dateTimeFormatter);
        System.out.println("formattedLocalDate "  + formattedLocalDate);


    }
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
