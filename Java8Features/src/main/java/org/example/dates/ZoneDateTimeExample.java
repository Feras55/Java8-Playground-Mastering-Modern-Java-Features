package org.example.dates;

import java.time.*;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime  zonedDateTime = ZonedDateTime.now();
        System.out.println("Zone Date Time " + zonedDateTime);

        System.out.println("Zone Offset: " + zonedDateTime.getOffset());
        System.out.println("Zone ID: " + zonedDateTime.getZone());

        System.out.println("Available Zones: " + ZoneId.getAvailableZoneIds());
        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);
        System.out.println("No of Zones: " + ZoneId.getAvailableZoneIds().size());
        System.out.println("Egypt          : " + ZonedDateTime.now(ZoneId.of("Egypt")));
        System.out.println("Europe/Berlin  : " + ZonedDateTime.now(ZoneId.of("Europe/Berlin")));
        System.out.println("Europe/Istanbul: " + ZonedDateTime.now(ZoneId.of("Europe/Istanbul")));
        System.out.println("Asia/Istanbul  : " + ZonedDateTime.now(ZoneId.of("Asia/Istanbul")));
        System.out.println("Asia/Riyadh    : " + ZonedDateTime.now(ZoneId.of("Asia/Riyadh")));


        System.out.println("ZoneDateTime using clock: " +
                ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Riyadh"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Riyadh"));
        System.out.println(localDateTime);

        LocalDateTime  localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Riyadh")));
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println(localDateTime2);

        /*
                Convert from localDateTime, Instant  to ZoneDateTime
         */

        LocalDateTime   localDateTime3 =   LocalDateTime.now();
        System.out.println(localDateTime3);

        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime1);

        System.out.println(Instant.now().atZone(ZoneId.systemDefault()));

        OffsetDateTime  offsetDateTime  =  localDateTime3.atOffset(ZoneOffset.ofHours(+2));
        System.out.println("offsetDateTime: " + offsetDateTime);
    }
}
