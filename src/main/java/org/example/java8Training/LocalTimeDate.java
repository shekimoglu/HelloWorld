package org.example.java8Training;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDate {

    public static void main(String[] args) {
        //LocalTime
        //LocalTime is a class that represents time without a date and time zone.
        //It is a part of the java.time package.
        //LocalTime is immutable and thread-safe.
        //LocalTime has no time zone information.
        //LocalTime is represented in the format of hours, minutes, seconds, and nanoseconds}

        //examples of LocalTime
        //create a LocalTime object with the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        //create a LocalTime object with a specific time
        LocalTime specificTime = LocalTime.of(12, 30, 45);
        System.out.println("Specific time: " + specificTime);

        //get the hour, minute, second, and nanosecond of a LocalTime object
        int hour = specificTime.getHour();
        int minute = specificTime.getMinute();
        int second = specificTime.getSecond();
        int nano = specificTime.getNano();
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        //add hours, minutes, seconds, and nanoseconds to a LocalTime object
        LocalTime newTime = specificTime.plusHours(2).plusMinutes(10).plusSeconds(20).plusNanos(500000000);
        System.out.println("New time: " + newTime);


        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }

        ZoneId zoneId = ZoneId.of("America/New_York");
        LocalTime localTime = LocalTime.now(zoneId);
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);


        //data time formatter
        //DateTimeFormatter is a class that provides formatting and parsing of date-time objects.
        //It is a part of the java.time.format package.
        //DateTimeFormatter is used to format date-time objects into strings and parse strings into date-time objects.

        //examples of DateTimeFormatter
        //create a DateTimeFormatter object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //format a LocalDateTime object using the formatter
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted date-time: " + formattedDateTime);

        //parse a string into a LocalDateTime object using the formatter
        LocalDateTime parsedDateTime = LocalDateTime.parse("2022-01-01 12:00:00", formatter);
        System.out.println("Parsed date-time: " + parsedDateTime);
    }
}
