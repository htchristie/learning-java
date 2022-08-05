package objectOrientedProgramming.secondExample.application;

import objectOrientedProgramming.secondExample.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Price: ");
        double price = scan.nextDouble();

        System.out.print("Quantity in stock: ");
        int stock = scan.nextInt();

        Product product = new Product(name, price, stock);

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added to stock: ");
        int quantity = scan.nextInt();
        product.addStock(quantity);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeStock(quantity);
        System.out.println("Updated data: " + product);

        scan.close();
    }
}
