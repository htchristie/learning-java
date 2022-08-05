package exercises.oopExercises.exerciseFive.application;

import exercises.oopExercises.exerciseFive.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter account holder: ");
        String name = scan.nextLine();

        System.out.println("Is there a initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(scan.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(scan.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        scan.close();
    }
}
