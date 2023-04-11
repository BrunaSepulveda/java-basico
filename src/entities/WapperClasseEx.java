package entities;

public class WapperClasseEx {
  static int x = 20;
  static Integer obj = x;
  public static void printBoxing(){
    System.out.println(obj);
  }

  public static void printUnboxing(){
    int y =  obj;
    System.out.println(y);
  }
}
