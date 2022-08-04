package beecrowdExercises;

import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {

        /* Read two integer values, in this case, the variables A and B. After this, calculate the sum
        between them and assign it to the variable SOMA. Write the value of this variable. */

        Scanner scan = new Scanner(System.in);

        int A, B, SOMA;

        A = scan.nextInt();
        B = scan.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
