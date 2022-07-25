package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {

        /*
        In this problem, the task is to read a code of a product 1, the number of units of product 1,
        the price for one unit of product 1, the code of a product 2, the number of units of product
        2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

        Input
        The input file contains two lines of data. In each line there will be 3 values: two integers
        and a floating value with 2 digits after the decimal point.

        Output
        The output file must be a message like the following example where "Valor a pagar" means Value
        to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2
        digits after the point.
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int code, units;
        double price, total;

        code = scan.nextInt();
        units = scan.nextInt();
        price = scan.nextDouble();

        total = units * price;

        code = scan.nextInt();
        units = scan.nextInt();
        price = scan.nextDouble();

        total += units * price;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        scan.close();
    }
}
