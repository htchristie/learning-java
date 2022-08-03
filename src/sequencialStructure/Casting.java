package sequencialStructure;

public class Casting {
    public static void main(String[] args) {

        int x = 5;
        int y = 2;
        double result1, result2;

        result1 = x / y;
        System.out.println(result1); //since both variables are int, result is 2

        result2 = (double) x / y;
        System.out.println(result2); //transforms result to double

        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        double m;
        int n;

        m = 5.0;
        n = (int) m; //confirms that m, double, should be attributed to n, int, even if it loses information

        System.out.println(m + " -> " + n);
    }
}
