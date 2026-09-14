package exercicios;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Employment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        Locale.setDefault(Locale.US);

        System.out.println("Name: ");
        employee.name = scanner.nextLine();

        System.out.println("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.println("Tax: ");
        employee.tax = scanner.nextDouble();

        employee.netSalary();
        System.out.println(employee);

        System.out.println("Which percentage to increase salary?");
        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

    }
}
