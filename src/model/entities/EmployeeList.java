package model.entities;

import java.util.ArrayList;
import java.util.Optional;

public class EmployeeList {
  private ArrayList<Employee> listEmployees = new ArrayList<>();

  public void addList(int id, String name, double salary){
    Employee newEmployee = new Employee(id, name, salary);
    listEmployees.add(newEmployee);
  }

  public Optional<Employee> findEmployeeById(int id){
    Optional<Employee> foundEmployee = listEmployees.stream().filter(x -> x.id == id).findFirst();
    return foundEmployee;
  }

  public void incrementSalary(int id, double percent){
    Optional<Employee> foundEmployee = this.findEmployeeById(id);
    if(foundEmployee.isPresent()) {
      foundEmployee.get().incrementSalary(percent);
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
