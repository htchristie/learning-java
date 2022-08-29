package functionalProgramming.function.application;

import functionalProgramming.function.entities.Product;
import functionalProgramming.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        products.forEach(System.out::println);
        System.out.println("----------------");

        /*
        map function -> applies a function to each element of the stream and returns a new stream
        stream -> data sequence

        list to stream: .stream()
        stream to list: .collect(Collectors.toList())
        */

        List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // static method:
        // List<String> names = products.stream().map(Product::staticToUpperCase).collect(Collectors.toList());

        // non-static method:
        // List<String> names = products.stream().map(Product::nonStaticToUpperCase).collect(Collectors.toList());

        // declared lambda:
        /* Function<Product, String> function = p -> p.getName().toUpperCase();
        List<String> names = products.stream().map(function).collect(Collectors.toList()); */

        // inline lambda:
        // List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
