package exercises.arrayExercises.arraySum;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How big should the arrays be?");
        int N = scan.nextInt();
        int[] arrayA = new int[N], arrayB = new int[N], arrayC = new int[N];

        System.out.println("ENTER ARRAY A:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }

        System.out.println("ENTER ARRAY B:");
        for (int j = 0; j < arrayB.length; j++) {
            arrayB[j] = scan.nextInt();
        }

        System.out.println("RESULTING ARRAY:");
        for (int k = 0; k < arrayC.length; k++) {
            arrayB[k] = arrayA[k] + arrayB[k];
            System.out.println(arrayB[k]);
        }

        scan.close();
    }
}
