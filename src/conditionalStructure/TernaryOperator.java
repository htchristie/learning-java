package conditionalStructure;

import java.util.Scanner;

public class TernaryOperator {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String evenOdd = (number%2 == 0) ? "Even": "Odd";
        System.out.println("The number is " + evenOdd);

        scan.close();
    }
}
