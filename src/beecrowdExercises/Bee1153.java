package beecrowdExercises;

import java.util.Scanner;

public class Bee1153 {
    public static void main (String [] args) {

        /*
        Read a value N. Calculate and write its corresponding factorial. Factorial of
        N = N * (N-1) * (N-2) * (N-3) * ... * 1.

        Input
        The input contains an integer value N (0 < N < 13).

        Output
        The output contains an integer value corresponding to the factorial of N.
        */

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int factorial = N;

        for (int i = 1; i < N; i++) {
            factorial *= (N-i);
        }

        System.out.println(factorial);
        scan.close();
    }
}
