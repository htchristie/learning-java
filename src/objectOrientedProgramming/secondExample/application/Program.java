package objectOrientedProgramming.secondExample.application;

import objectOrientedProgramming.secondExample.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = scan.nextLine();

        System.out.print("Price: ");
        product.price = scan.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

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
