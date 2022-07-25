package sequencial_structure;

public class MathFunctions {
    public static void main(String[] args) {

        // Math.sqrt(x) -> square root of x
        // Math.pow(x, y) -> x raised to the power y
        // Math, abs(x) -> absolute value of x

        double x = 3.0, y = 4.0, z = -5.0;
        double A, B, C;

        A = Math.pow(x, y);
        System.out.println(A);

        B = Math.sqrt(y);
        System.out.println(B);

        C = Math.abs(z);
        System.out.println(C);
    }
}
