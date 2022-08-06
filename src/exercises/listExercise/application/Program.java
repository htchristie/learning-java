package exercises.listExercise.application;

import exercises.listExercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int N = scan.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int id = scan.nextInt();
            while (hasId(employees, id)) {
                System.out.println("ID is already registered. Please try again: ");
                id = scan.nextInt();
            }
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            employees.add(new Employee(id, name, salary));
            System.out.println(" ");
        }

        System.out.print("Which employee will receive a raise (ID)? ");
        int idRaise = scan.nextInt();

        Employee employee = employees.stream().filter(x -> x.getId() == idRaise).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("This ID does not exist.");
        } else {
            System.out.print("What's the percentage of the raise? ");
            double raise = scan.nextDouble();
            employee.raise(raise);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for (Employee emp: employees) {
            System.out.println(emp);
        }

        scan.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
