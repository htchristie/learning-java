package arraysAndLists.arrayOfClasses.application;

import arraysAndLists.arrayOfClasses.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Product[] products = new Product[N];
        double sum = 0;

        for (int i = 0; i < products.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            products[i] = new Product(name, price);
        }

        for (int j = 0; j < products.length; j++) {
            sum += products[j].getPrice();
        }

        System.out.printf("Total to pay: $ %.2f", sum);
        scan.close();
    }
}
