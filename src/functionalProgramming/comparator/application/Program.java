package functionalProgramming.comparator.application;

import functionalProgramming.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Tablet", 450.00));

        // IMPLEMENTING Comparator<Product> INTERFACE:
        // products.sort(new ProductComparator());

        // USING AN ANONYMOUS CLASS:
        /* Comparator<Product> comparator = new Comparator<Product>() {
            // anonymous class
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }
        }; */

        // LAMBDA EXPRESSION

        /* Comparator<Product> comparator = (p1, p2) -> {
            return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        }; */

        // since theres only one line of implementation, lambda can be further simplified like this:
        // Comparator<Product> comparator = (p1, p2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());

        // products.sort(comparator);

        // LAMBDA EXPRESSION AS AN ARGUMENT:
        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product: products) {
            System.out.println(product);
        }
    }
}
