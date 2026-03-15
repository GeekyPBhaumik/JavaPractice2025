package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NewDateTimeApiDemo {
    public static void main(String[] args) {
        //LocalDate
        //Get the current date and print it.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Create a LocalDate for your birthday and print the day of the week it falls on.
        LocalDate birthDate = LocalDate.of(1998,11,22);
        System.out.println(birthDate.getDayOfWeek());

        //Get the current date and print the year, month, and day separately.
        System.out.println("Year:"+currentDate.getYear() + ",Month:"+currentDate.getMonth()+",Day:"+currentDate.getDayOfMonth());

        //Add 10 days to the current date and print the result.
        System.out.println(currentDate.plusDays(10));

        //Find the date 3 months ago from today.
        System.out.println(currentDate.minusMonths(3));

        //Get the current time and print it.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Create a LocalTime of 09:30:00 and print the hour and minute separately.
        LocalTime localTime = LocalTime.of(9,30,0);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());

        //Add 2 hours and 30 minutes to the current time and print the result.
        System.out.println(currentTime.plusHours(2).plusMinutes(30));

        //LocalDateTime
        //Get the current date and time and print it.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Create a LocalDateTime for 2024-12-25 10:30:00 and print it.
        LocalDateTime localDateTime = LocalDateTime.of(2024,12,25,10,30,0);
        System.out.println(localDateTime);

        //Combine a LocalDate of 2024-01-15 and a LocalTime of 14:30:00 into a LocalDateTime and print it.
        LocalDate newCurrentDate = LocalDate.of(2024,1,15);
        LocalTime newCurrentTime = LocalTime.of(14,30,0);
        LocalDateTime newCurrentDateTime = LocalDateTime.of(newCurrentDate,newCurrentTime);
        System.out.println(newCurrentDateTime);

        //DateTimeFormatter
        //Get the current date and format it into dd/MM/yyyy pattern and print it.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String currentDateStr = dateTimeFormatter.format(currentDate);
        System.out.println(currentDateStr);

        //Parse the string "25-12-2024" into a LocalDate using the pattern dd-MM-yyyy and print it.
        String date = "25-12-2024";
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate newLocalDate = LocalDate.parse(date,newFormatter);
        System.out.println(newLocalDate);

        //Period and Duration
        //Find the period between 2020-01-01 and today and print the years, months and days separately.
        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2020,01,01);
        Period period = Period.between(secondDate,firstDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        //here we are not getting the exact no. of days in between
        //We are getting 15-1 i.e. 14 as of 15-03-2026
        //To get the exact diff between no. of days in between, we need ChronoUnit
        long noOfDays = ChronoUnit.DAYS.between(secondDate,firstDate);
        System.out.println(noOfDays);


        //Find the duration between 09:00:00 and 17:30:00 and print the total hours and minutes.
        LocalTime firstTime = LocalTime.of(9,00,00);
        LocalTime secondTime = LocalTime.of(17,30,00);
        Duration duration = Duration.between(firstTime,secondTime);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        //Manipulation
        //Get today's date, subtract 1 year, add 2 months, and add 5 days and print the result.
        LocalDate todayDate = LocalDate.now();
        LocalDate manipulatedDate = todayDate.minusYears(1).plusMonths(2).plusDays(5);
        System.out.println(manipulatedDate);

        //Check if today's date is before or after 2025-01-01 and print the result.
        System.out.println(todayDate.isAfter(LocalDate.of(2025,01,01)));

        //Create a LocalDate for today, format it to dd-MMM-yyyy pattern
        //(example output: 15-Jan-2024) and print it.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String todayDateStr = todayDate.format(formatter);
        System.out.println(todayDateStr);

        //Find how many days are left until 2025-01-01 from today using Period or ChronoUnit.
        long days = ChronoUnit.DAYS.between(LocalDate.of(2025,01,01),todayDate);
        System.out.println("No of Days Left:"+days);

        //Create a LocalDateTime for now, add 1 hour and 30 minutes,
        //and format the result into dd/MM/yyyy HH:mm pattern and print it.
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.plusHours(1).plusMinutes(30).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        // Get current date and time in "Asia/Kolkata" timezone
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
    }
}
