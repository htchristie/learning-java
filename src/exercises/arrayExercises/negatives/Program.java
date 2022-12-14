package exercises.arrayExercises.negatives;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers should we analyze?");
        int N = scan.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        scan.close();
    }
}
