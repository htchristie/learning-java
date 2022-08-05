package exercises.beecrowdExercises;

import java.util.Scanner;

public class Bee1072 {
    public static void main (String[] args) {

        /*

        Read an integer N. This N will be the number of integer numbers X that will be read.

        Print how many these numbers X are in the interval [10,20] and how many values are out of
        this interval.

        Input
        The first line of input is an integer N (N < 10000), that indicates the total number of
        test cases. Each case is an integer number X (-107 < X < 107).

        Output
        For each test case, print how many numbers are in and how many values are out of the interval.


        */

        Scanner scan = new Scanner(System.in);

        int inRange = 0, outsideRange = 0, aux;
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            aux = scan.nextInt();

            if (aux >= 10 && aux <= 20) {
                inRange++;
            } else {
                outsideRange++;
            }
        }

        System.out.println(inRange + " in");
        System.out.println(outsideRange + " out");

        scan.close();
    }
}
