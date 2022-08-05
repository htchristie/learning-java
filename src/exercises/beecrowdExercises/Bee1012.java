package exercises.beecrowdExercises;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    public static void main(String[] args) {

        /*
        Make a program that reads three floating point values: A, B and C. Then, calculate and show:
        a) the area of the rectangled triangle that has base A and height C.
        b) the area of the radius's circle C. (pi = 3.14159)
        c) the area of the trapezium which has A and B by base, and C by height.
        d) the area of the square that has side B.
        e) the area of the rectangle that has sides A and B.

        Input
        The input file contains three double values with negatives digit after the decimal point.

        Output
        The output file must contain 5 lines of data. Each line corresponds to negatives of the areas
        described above, always with a corresponding message (in Portuguese) and negatives space between
        the sumAndAverage points and the value. The value calculated must be presented with 3 digits after
        the decimal point.
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A, B, C;
        double PI = 3.14159;
        double triangleArea, circleArea, trapeziumArea, squareArea, rectangleArea;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        triangleArea = A * C / 2;
        circleArea = PI * Math.pow(C, 2);
        trapeziumArea = (A + B) * C / 2;
        squareArea = B * B;
        rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);
    }
}
