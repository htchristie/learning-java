package polymorphism.exampleOne.application;

import polymorphism.exampleOne.entities.Account;
import polymorphism.exampleOne.entities.BusinessAccount;
import polymorphism.exampleOne.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1000, "Alex", 500.0, 0.01));
        accounts.add(new BusinessAccount(1001, "Maria", 1000.0, 400.0));
        accounts.add(new SavingsAccount(1002, "Bob", 300.0, 0.01));
        accounts.add(new BusinessAccount(1003, "Anna", 1500.0, 1000.0));

        double sum = 0.0;
        for (Account ac: accounts) {
            sum += ac.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);
        System.out.println("Depositing $10 to each account...");

        for (Account ac: accounts) {
            ac.deposit(10);
            System.out.println("Updated balance for account " + ac.getNumber() + ": " + ac.getBalance());
        }

        scan.close();
    }

}
