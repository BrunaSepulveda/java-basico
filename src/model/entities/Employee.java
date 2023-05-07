package model.entities;

public class Employee {
  public int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void incrementSalary(double percent){
    salary += salary*(percent/100);
  }

  public String toString(){
    return id + ", " + name + ", " + salary;
  }
}
