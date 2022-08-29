package exercises.streamExercise.application;

import exercises.streamExercise.model.entities.Employee;
import exercises.streamExercise.model.services.EmployeeService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(in);

        System.out.print("File path: ");
        String path = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.print("Minimal salary: ");
            double min = scan.nextDouble();

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > min)
                    .map(e -> e.getEmail())
                    .sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is greater than $ 2000.00:");
            emails.forEach(System.out::println);

            EmployeeService employeeService = new EmployeeService();
            double sum = employeeService.filteredSum(employees, e -> e.getName().charAt(0) == 'M');

            System.out.println("Sum of all salaries of employees whose name starts with the letter 'M': " + sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
