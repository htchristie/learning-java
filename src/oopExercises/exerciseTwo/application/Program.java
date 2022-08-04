package oopExercises.exerciseTwo.application;

import oopExercises.exerciseTwo.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scan.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scan.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("What's the raise percentage? ");
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee);
        scan.close();
    }
}
