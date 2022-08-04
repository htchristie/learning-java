package beecrowdExercises;

import java.util.Scanner;

public class Bee1143 {
    public static void main (String [] args) {

        /*

        Write a program that reads an integer N (1 < N < 1000). This N is the number of output lines
        printed by this program.

        Input
        The input file contains an integer N.

        Output
        Print the output according to the given example.

        */

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int line, pow2, pow3;

        for (int i = 1; i <= N; i++) {
            line = i;
            pow2 = (int) Math.pow(i, 2);
            pow3 = (int) Math.pow(i, 3);

            System.out.printf("%d %d %d%n", line, pow2, pow3);
        }

        scan.close();
    }
}
