package exercises.beecrowdExercises;

import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {

        /*
        Read two integer values (A and B). After, the program should print the message "Sao Multiplos"
        (are multiples) or "Nao sao Multiplos" (aren’t multiples), corresponding to the read values.

        Input
        The input has two integer numbers.

        Output
        Print the relative message to the input as stated above.
        */

        Scanner scan = new Scanner(System.in);

        int A, B;

        A = scan.nextInt();
        B = scan.nextInt();

        if (A%B == 0 || B%A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        scan.close();
    }
}
