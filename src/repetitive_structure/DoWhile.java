package repetitive_structure;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args) {

        // command block is executed at least once since the condition in verified at the end

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double degrees, toFahrenheit;
        char repeat;

        do {
        System.out.print("Enter the temperature (Celsius): ");
        degrees = scan.nextDouble();

        toFahrenheit = degrees * 1.8 + 32;

        System.out.printf("Fahrenheit: %.2f%n", toFahrenheit);
        System.out.print("Would you like to go again? ");

        repeat = scan.next().charAt(0);
        } while (repeat != 'n');

        scan.close();
    }
}
