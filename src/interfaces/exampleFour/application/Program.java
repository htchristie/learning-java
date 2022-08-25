package interfaces.exampleFour.application;

import interfaces.exampleFour.services.BrazilInterestService;
import interfaces.exampleFour.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = scan.nextDouble();

        System.out.print("Months: ");
        int months = scan.nextInt();

        InterestService brazilInterestService = new BrazilInterestService(1.0);
        double payment = brazilInterestService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        scan.close();
    }
}
