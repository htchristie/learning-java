package exercises;

import java.util.Scanner;

public class Bee1157 {
    public static void main (String [] args) {

        /*

        Read an integer N and compute all its divisors.

        Input
        The input file contains an integer value.

        Output
        Write all positive divisors of N, one value per line.

        */

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
