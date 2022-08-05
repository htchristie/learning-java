package arraysAndLists;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        double[] heights = new double[N];
        double sum = 0, avg;

        for(int i = 0; i < N; i++) {
            heights[i] = scan.nextDouble();
        }

        for (int j = 0; j < N; j++) {
            sum += heights[j];
        }

        avg = sum / N;
        System.out.printf("Average: %.2f", avg);

        scan.close();
    }
}
