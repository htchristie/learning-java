package polymorphism.exampleThree.application;

import polymorphism.exampleThree.entities.Circle;
import polymorphism.exampleThree.entities.Rectangle;
import polymorphism.exampleThree.entities.Shape;
import polymorphism.exampleThree.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int N = scan.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.println("Shape #" + i + "data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char answer = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scan.next());

            if (answer == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("Height: ");
                double height = scan.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();

                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas:");

        for (Shape shape : shapes) {
            System.out.print(String.format("%.2f%n", shape.area()));
        }

        scan.close();
    }
}
