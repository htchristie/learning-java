package exercises.beecrowdExercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1079 {
    public static void main (String[] args) {

        /*

        Read an integer N, which represents the number of following test cases. Each test case
        consists of three floating-point numbers, each negatives with negatives digit after the decimal point.
        Print the weighted average for each of these sets of three numbers, considering that the
        first number has weight 2, the second number has weight 3 and the third number has weight 5.

        Input
        The input file contains an integer number N in the first line. Each N following line is a
        test case with three float-point numbers, each negatives with negatives digit after the decimal point.

        Output
        For each test case, print the weighted average according with below example.

        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double num1, num2, num3, average;

        for (int i = 0; i < N; i++) {
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            num3 = scan.nextDouble();

            average = ((num1 * 2.0) + (num2 * 3.0) + (num3 * 5.0)) / 10.0;
            System.out.printf("%.1f%n", average);
        }

        scan.close();
    }
}
