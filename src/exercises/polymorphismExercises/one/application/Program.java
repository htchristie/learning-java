package exercises.polymorphismExercises.one.application;

import exercises.polymorphismExercises.one.entities.ImportedProduct;
import exercises.polymorphismExercises.one.entities.Product;
import exercises.polymorphismExercises.one.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Number of products: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N ; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (answer == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                products.add(new UsedProduct(name, price, date));
            } else if (answer == 'i') {
                System.out.print("Custom fee: ");
                double fee = scan.nextDouble();
                products.add(new ImportedProduct(name, price, fee));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product p: products) {
            System.out.println(p.priceTag());
        }

        scan.close();

    }
}
