package exercises.arrayExercises.biggerNumber;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers should we analyze?");
        int N = scan.nextInt();
        int index = 0;
        double[] numbers = new double[N];
        double biggest = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > biggest) {
                biggest = numbers[j];
                index = j;
            }
        }

        System.out.println("BIGGEST NUMBER: " + biggest);
        System.out.println("BIGGEST NUMBER'S INDEX: " + index);
    }
}
