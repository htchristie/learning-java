package functionalProgramming.example.application;

import functionalProgramming.example.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("File path: ");
        String path = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Product> products = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            double avg = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / products.size();

            System.out.println("Average price: $ " + String.format("%.2f", avg));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comparator.reversed()) // sorts by name on reverse order
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
