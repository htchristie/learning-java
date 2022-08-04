package beecrowdExercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {

        /*
        Write a program that reads an employee's number, his/her worked hours number in a month and the
        amount he received per hour. Print the employee's number and salary that he/she will receive
        at end of the month, with two decimal places.

        Input
        The input file contains 2 integer numbers and 1 value of floating point, representing the number,
        worked hours amount and the amount the employee receives per worked hour.

        Output
        Print the number and the employee's salary, according to the given example, with a blank space
        before and after the equal signal.
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int employeeNumber, workedHours;
        double amountPerHour, salary;

        employeeNumber = scan.nextInt();
        workedHours = scan.nextInt();
        amountPerHour = scan.nextDouble();

        salary = (double) workedHours * amountPerHour;
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        scan.close();
    }
}
