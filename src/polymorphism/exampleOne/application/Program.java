package polymorphism.exampleOne.application;

import polymorphism.exampleOne.entities.Account;
import polymorphism.exampleOne.entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Account x = new Account(1020, "Brad", 2000.0);
        Account y = new SavingsAccount(1023, "Carol", 2000.0, 0.01);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        scan.close();
    }

}
