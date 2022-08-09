package exercises.enumExercise.application;

import exercises.enumExercise.entities.Client;
import exercises.enumExercise.entities.Order;
import exercises.enumExercise.entities.OrderItem;
import exercises.enumExercise.entities.Product;
import exercises.enumExercise.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birthdate: ");
        Date birthdate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthdate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        System.out.println("How many items are in this order?");
        int quantity = scan.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter #" + i + " item data:");
            scan.nextLine();
            System.out.print("Product name: ");
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scan.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        scan.close();
    }
}
