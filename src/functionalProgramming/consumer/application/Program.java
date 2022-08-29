package functionalProgramming.consumer.application;

import functionalProgramming.consumer.entities.Product;
import functionalProgramming.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        for (Product product: list) {
            System.out.println(product);
        }

        System.out.println("----------------");

        // using a class that implements Consumer interface
        list.forEach(new PriceUpdate());

        // using reference method to print each product
        list.forEach(System.out::println);


        // OTHER WAYS TO DO THE SAME THING

        // static method:
        // list.forEach(Product::staticPriceUpdate);

        //non-static method:
        // list.forEach(Product::nonStaticPriceUpdate);

        // declared lambda expression:
        /* Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
           list.forEach(consumer); */

        // inline lambda expression:
        // list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
    }
}
