package generics.exampleOne.application;

import generics.exampleOne.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintService<String> printService = new PrintService<>();

        System.out.print("How many values? ");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String value = scan.next();
            printService.addValue(value);
        }

        printService.print();
        System.out.print("First value: " + printService.first());

        scan.close();
    }
}
