package oopExercises.exerciseFour.application;

import oopExercises.exerciseFour.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Dollar value (R$): ");
        double worth = scan.nextDouble();
        System.out.println("How many dollars will be purchased? ");
        double quantity = scan.nextDouble();

        System.out.printf("Price (R$): %.2f", CurrencyConverter.toReal(worth, quantity));
        scan.close();
    }
}
