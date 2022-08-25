package interfaces.exampleThree.application;

import interfaces.exampleThree.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        String path = "C:\\Users\\017665631\\Downloads\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeCsv = bufferedReader.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }

            Collections.sort(employees); // ordena a lista
            for (Employee employee: employees) {
                System.out.println(employee.getName() + ", $ " + employee.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
