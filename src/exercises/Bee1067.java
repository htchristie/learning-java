package exercises;

import java.util.Scanner;

public class Bee1067 {
    public static void main (String [] args) {

        /*

        Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from 1 to X, each one
        in a line, including X if is the case.

        Input
        The input will be an integer value.

        Output
        Print all odd values between 1 and X, including X if is the case.

        */

        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();

        for (int i = 0; i <= X; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
