package exercises.arrayExercises.sumAndAverage;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers should we analyze?");
        int N = scan.nextInt();
        double[] numbers = new double[N];
        double sum = 0, avg;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }

        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }

        avg = sum / numbers.length;

        System.out.println("SUM = " + sum);
        System.out.printf("AVERAGE = %.2f", avg);

        scan.close();
    }
}
