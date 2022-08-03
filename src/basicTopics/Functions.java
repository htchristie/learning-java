package basicTopics;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        int max = findMax(X, Y, Z);

        System.out.println("The largest number is: " + max);
        scan.close();
    }

    public static int findMax(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
