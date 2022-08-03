package repetitiveStructure;

import java.util.Scanner;

public class For {
    public static void main (String [] args) {

        // should be used when you previously know how many repetitions it will take

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int aux = scan.nextInt();
            sum += aux;
        }

        System.out.println("Sum: " + sum);

        scan.close();
    }
}
