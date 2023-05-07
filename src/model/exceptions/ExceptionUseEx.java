package model.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ExceptionUseEx {

  public void test() {
    Scanner sc = new Scanner(System.in);
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.print("N");
      int n = sc.nextInt();
      System.out.print("In dd/MM/yyy");
      Date checkIn = sdf.parse(sc.next());
      System.out.print("Out dd/MM/yyy");
      Date checkOut = sdf.parse(sc.next());
      Reservation rs = new Reservation(n);
      rs.updateDates(checkIn, checkOut);
  } catch (ParseException e) {
      System.out.println(e.getMessage());
  } catch (DomainException e) {
      System.out.println(e.getMessage());
  } finally {
    sc.close();
  }
  }
}
