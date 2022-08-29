package generics.exampleThree.application;

import generics.exampleThree.entities.Circle;
import generics.exampleThree.entities.Rectangle;
import generics.exampleThree.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(circles)));
    }

    public static double totalArea(List<? extends Shape> list) {
        // accepts shape and its subtypes
        // cannot add items to the (? extends Shape) list
        double sum = 0.0;
        for (Shape shape: list) {
            sum += shape.area();
        }
        return sum;
    }
}
