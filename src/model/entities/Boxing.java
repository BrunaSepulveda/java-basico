package model.entities;

public class Boxing {
  static int x = 20;
  static Object obj = x;
  public static void printBoxing(){
    System.out.println(obj);
  }

  public static void printUnboxingCast(){
    int y = (int) obj;
    System.out.println(y);
  }

}
