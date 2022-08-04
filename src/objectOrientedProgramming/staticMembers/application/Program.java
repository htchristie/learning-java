package objectOrientedProgramming.staticMembers.application;

import objectOrientedProgramming.staticMembers.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI: %.2f%n", Calculator.PI);
    }
}
