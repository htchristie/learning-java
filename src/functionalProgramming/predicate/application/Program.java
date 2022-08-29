package functionalProgramming.predicate.application;

import functionalProgramming.predicate.entities.Product;
import functionalProgramming.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // lambda expression as predicate:
        // list.removeIf(x -> x.getPrice() >= 100);

        // instance of class ProductPredicate that implements functional interface Predicate
        list.removeIf(new ProductPredicate());

        for (Product product: list) {
            System.out.println(product);
        }


        // OTHER WAYS OF DOING THE SAME THING

        // static reference method:
        // list.removeIf(Product::staticProductPredicate);

        // non-static reference method:
        // list.removeIf(Product::nonStaticProductPredicate);

        // Predicate variable:
        /* Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
        list.removeIf(predicate); */

    }
}
