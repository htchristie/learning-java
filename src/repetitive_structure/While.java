package repetitive_structure;

import java.util.Scanner;

public class While {
    public static void main (String [] args) {

        // should be used when you don't previously know how many repetitions are needed

        // Write a program which repeatedly reads numbers until the user enters "0".
        // Once "0" is entered, print out the total.

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int number = scan.nextInt();

        while (number != 0) {
            sum += number;
            number = scan.nextInt();
        }

        System.out.println("Total: " + sum);
        scan.close();
    }
}
