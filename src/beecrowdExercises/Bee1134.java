package beecrowdExercises;

import java.util.Scanner;

public class Bee1134 {
    public static void main (String [] args) {

        /*

        A gas station wants to determine which of their products is the preference of their customers.
        Write a program to read the type of fuel supplied (coded as follows: 1. Alcohol 2. Gasoline
        3. Diesel 4. End). If you enter an invalid code (outside the range of 1 to 4) a new code
        must be requested. The program will end when the inserted code is the number 4.

        Input
        The input contains only integer and positive values.

        Output
        It should be written the message: "MUITO OBRIGADO" and the amount of customers who fueled
        each fuel type, as an example.

        */

        Scanner scan = new Scanner(System.in);

        int alcohol = 0, gasoline = 0, diesel = 0;
        int code = scan.nextInt();

        while (code != 4) {
            if (code == 1) {
                alcohol += 1;
            }
            else if (code == 2) {
                gasoline += 1;
            }
            else if (code == 3) {
                diesel += 1;
            }

            code = scan.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);

        scan.close();
    }
}
