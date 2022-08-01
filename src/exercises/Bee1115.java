package exercises;

import java.util.Scanner;

public class Bee1115 {
    public static void main (String[] args) {

        /*

        Write a program to read the coordinates (X, Y) of an indeterminate number of points in
        Cartesian system. For each point write the quadrant to which it belongs. The program finish
        when at least one of two coordinates is NULL (in this situation without writing any message).

        Input
        The input contains several tests cases. Each test case contains two integer numbers.

        Output
        For each test case, print the corresponding quadrant which these coordinates belong, as in
        the example.

        */

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            X = scan.nextInt();
            Y = scan.nextInt();
        }

        scan.close();
    }
}
