import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios quer registrar? ");
        int n = sc.nextInt();
        int x = 1;
        EmployeeList el = new EmployeeList();
        while(n > 0){
            System.out.println("Employee #"+x);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            n -= 1;
            x += 1;
            el.addList(id, name, salary);
            System.out.println();
        }
        System.out.print("Qual funcionário terá um aumento de salário? id: ");
        int id = sc.nextInt();
        System.out.print("Qual o percentual? percent: ");
        double percent = sc.nextDouble();
        el.incrementSalary(id, percent);
        el.printAllList();
        sc.close();
    }
}
