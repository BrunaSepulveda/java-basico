package entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateTest {
  static LocalDate d01 = LocalDate.now();
  static LocalDateTime d02 = LocalDateTime.now();
  static Instant d03 = Instant.now();

  public static void dates(){
    System.out.println("d01 = " + d01);
    System.out.println("d02 = " + d02);
    System.out.println("d03 = " + d03);
  }

  public static void parsingDatesByString(String dateString){
    LocalDate d04 = LocalDate.parse(dateString);
    System.out.println("d04 = " + d04);
  }

  public static void parsingDatesByStringDateTime(String dateString){
    LocalDateTime d05 = LocalDateTime.parse(dateString);
    System.out.println("d05 = " + d05);
  }

  public static void parsingDatesByStringInstant(String dateString){
    //openjdk version "17.0.6" 2023-01-17
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
    ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateString, formatter);
    Instant d06 = zonedDateTime.toInstant();
    System.out.println("d06 = " + d06);
  }

  public static void parsingDateOfPattern(String dateString, String pattern){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    LocalDate d07 = LocalDate.parse(dateString, formatter);
    System.out.println("d07 = " + d07);
  }

  public static void parsingDateOf(int year, int month, int day){
    System.out.println("d08 = " + LocalDate.of(year, month, day));
  }

  public static void dateToString(String pattern){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.systemDefault());
    System.out.println("d09 = " +formatter.format(d01));
    System.out.println("d10 = " +formatter.format(Instant.parse("2022-07-20T01:30:26Z")));
    System.out.println("d11 = " + LocalDate.ofInstant(Instant.parse("2022-07-20T23:30:26Z"), ZoneId.of("Portugal")));
  }
}
