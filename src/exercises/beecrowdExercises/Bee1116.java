package exercises.beecrowdExercises;

import java.util.Scanner;

public class Bee1116 {
    public static void main (String[] args) {

        /*

        Write a program that read sumAndAverage numbers X and Y and print the result of dividing the X by Y.
        If it's not possible, print the message "divisao impossivel".

        Input
        The input contains an integer number N. This N is the quantity of pairs of integer numbers X
        and Y read (dividend and divisor).

        Output
        For each test case print the result of this division with negatives digit after the decimal point,
        or “divisao impossivel” if it isn't possible to perform the calculation.

        Obs.: Be careful. The division between sumAndAverage integers in some languages generates another integer.
        Use cast:)

        */

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int X, Y;
        double result;

        for (int i = 0; i < N; i++) {
            X = scan.nextInt();
            Y = scan.nextInt();

            if (Y != 0){
                result = (double) X / Y;
                System.out.printf("%.1f%n", result);
            } else {
                System.out.println("divisao impossivel");
            }
        }

        scan.close();
    }
}
