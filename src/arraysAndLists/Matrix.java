package arraysAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] matrix = new int[N][N];
        List<Integer> negatives = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scan.nextInt();

                if (matrix[i][j] < 0) {
                    negatives.add(matrix[i][j]);
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < N; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        System.out.println("Negative numbers in the matrix: ");
        for (Integer number : negatives) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}
