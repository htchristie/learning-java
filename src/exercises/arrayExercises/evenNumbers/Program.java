package exercises.arrayExercises.evenNumbers;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers should we analyze?");
        int N = scan.nextInt();
        int[] numbers = new int[N];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("EVEN NUMBERS:");

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                sum++;
                System.out.print(numbers[j] + " ");
            }
        }

        System.out.println("");
        System.out.println("AMOUNT OF EVEN NUMBERS: " + sum);

        scan.close();
    }
}
