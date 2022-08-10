package inheritanceAndPolymorphism.exampleOne.application;

import inheritanceAndPolymorphism.exampleOne.entities.Account;
import inheritanceAndPolymorphism.exampleOne.entities.BusinessAccount;
import inheritanceAndPolymorphism.exampleOne.entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account account2 = businessAccount;
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        System.out.println(account3.getHolder());

        Account account4 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        System.out.println(account4.getNumber());


        // DOWNCASTING
        BusinessAccount account5 = (BusinessAccount) account3;
        account5.loan(100.0);
        System.out.println(account5.getBalance());

        // BusinessAccount account6 = (BusinessAccount) account4; -> class cast exception
        if (account4 instanceof BusinessAccount) {
            BusinessAccount account6 = (BusinessAccount) account4;
            account6.loan(200.0);
            System.out.println("Loan!");
        }

        if (account4 instanceof SavingsAccount) {
            SavingsAccount account6 = (SavingsAccount) account4;
            account6.updateBalance();
            System.out.println("Update!");
        }

        scan.close();
    }

}
