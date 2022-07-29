package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {

        /*
         Using the following table, write a program that reads a code and the amount of an item. After,
         print the value to pay. This is a very simple program with the only intention of practice of
         selection commands.

         CODE
         1  Cachorro Quente     R$ 4,00
         2  X-Salada            R$ 4,50
         3  X-Bacon             R$ 5,00
         4  Torrada simples     R$ 2,00
         5  Refrigerante        R$ 1,50

        Input
        The input file contains two integer numbers X and Y. X is the product code and Y is the
        quantity of this item according to the above table.

        Output
        The output must be a message "Total: R$ " followed by the total value to be paid, with 2
        digits after the decimal point.

        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();
        int quantity = scan.nextInt();
        double total;

        switch (code) {
            case 1:
                total = (double) quantity * 4;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 2:
                total = (double) quantity * 4.5;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 3:
                total = (double) quantity * 5;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 4:
                total = (double) quantity * 2;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 5:
                total = (double) quantity * 1.5;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
        }

        scan.close();
    }
}
