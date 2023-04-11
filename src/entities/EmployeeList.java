package entities;

import java.util.ArrayList;

public class EmployeeList {
  private ArrayList<Employee> listEmployees = new ArrayList<>();

  public void addList(int id, String name, double salary){
    Employee newEmployee = new Employee(id, name, salary);
    listEmployees.add(newEmployee);
  }

  public Employee findEmployeeById(int id){
    Employee foundEmployee = listEmployees.stream().filter(x -> x.id == id).findFirst().orElse(null);
    return foundEmployee;
  }

  public void incrementSalary(int id, double percent){
    Employee foundEmployee = this.findEmployeeById(id);
    if(foundEmployee != null) {
      foundEmployee.incrementSalary(percent);
    } else {
      System.out.println("Esse id não corresponde a nenhum funcionário");
    }
  }

  public void printAllList(){
    for (Employee employee : listEmployees) {
      System.out.println(employee.toString());
    }
  }
}
