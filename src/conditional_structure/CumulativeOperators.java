package conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class CumulativeOperators {
    public static void main(String[] args) {

        // a += b -> a = a + b
        // a -= b -> a = a - b
        // a *= b -> a = a * b
        // a /= b -> a = a / b
        // a %= b -> a = a % b

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int minutes = scan.nextInt();
        double total = 50.0;

        if (minutes > 100) {
            total += (minutes - 100) * 2;
        }

        System.out.printf("Total: %.2f%n", total);
        scan.close();
    }
}
