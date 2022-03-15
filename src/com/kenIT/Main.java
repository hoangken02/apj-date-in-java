package com.kenIT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Show date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // Show minute and seconds
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // Show full time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Set time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatterDate = localDateTime.format(dateTimeFormatter);
        System.out.println(formatterDate);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String formatterDate1 = localDateTime.format(dateTimeFormatter1);
        System.out.println(formatterDate1);
    }
}
