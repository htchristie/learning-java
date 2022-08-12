package exceptions.exampleOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
    }

    public static void method1() {
        System.out.println("~~~ METHOD 1 START ~~~");
        method2();
        System.out.println("~~~ METHOD 1 END ~~~");
    }

    public static void method2() {
        System.out.println("~~~ METHOD 2 START ~~~");
        Scanner scan = new Scanner(System.in);

        try {
            String[] names = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(names[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position.");
            e.printStackTrace();
            scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        }

        scan.close();
        System.out.println("~~~ METHOD 2 END ~~~");
    }
}
