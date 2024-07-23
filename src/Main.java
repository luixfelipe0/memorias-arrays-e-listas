import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int employeeId = sc.nextInt();

        Employee emp = returnEmployee(employeeList, employeeId);

        if(emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    static Employee returnEmployee(List<Employee> list, int id) {
        for (Employee emp : list) {
            if (emp.getID() == id) {
                return emp;
            }
        }
        return null;
    }

}