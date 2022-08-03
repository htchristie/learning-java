package sequencialStructure;

import java.util.Locale;

public class DataOutput {
    public static void main(String[] args) {

        double x = 17.357638;
        String name = "Belle";
        int age = 24;
        double salary = 4235.0;


        //decimal places
        System.out.printf("%.4f%n", x);

        //%.4 -> number of decimal places
        //%n -> line break

        Locale.setDefault(Locale.US); //changes symbols (, to .)
        System.out.printf("%.4f%n", x);

        //concatenate string
        System.out.println("The value of X is " + x);

        //using printf
        System.out.printf("The rounded value of X is %.2f%n", x);
        System.out.printf("%s is %d years old and earns %.2f dollars%n", name, age, salary);

        //%f -> float
        //%s -> string
        //%d -> int
    }
}
