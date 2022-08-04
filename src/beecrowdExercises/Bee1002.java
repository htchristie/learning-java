package beecrowdExercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {

        /*
        The formula to calculate the area of a circumference is defined as A = π . R2. Considering to
        this problem that π = 3.14159:
        Calculate the area using the formula given in the problem description.

        Input
        The input contains a value of floating point (double precision), that is the variable R.

        Output
        Present the message "A=" followed by the value of the variable, as in the example bellow, with
        four places after the decimal point. Use all double precision variables.
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double PI = 3.14159;
        double A, R;

        R = scan.nextDouble();
        A = PI * Math.pow(R, 2);

        System.out.println("A=" + A);

        scan.close();
    }
}
