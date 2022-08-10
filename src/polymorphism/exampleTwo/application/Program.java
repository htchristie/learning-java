package polymorphism.exampleTwo.application;

import polymorphism.exampleTwo.entities.Employee;
import polymorphism.exampleTwo.entities.OursourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Number of employees: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Employee " + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char answer = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Worked hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            if (answer == 'y') {
                System.out.print("Additional charge: ");
                double charge = scan.nextDouble();

                employees.add(new OursourcedEmployee(name, hours, valuePerHour, charge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee emp: employees) {
            System.out.println(emp);
        }

        scan.close();
    }
}
