package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            String[] names = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(names[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position.");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        }

        scan.close();
    }
}
