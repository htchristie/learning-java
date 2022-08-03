package conditionalStructure;

public class LogicalExpressions {
    public static void main(String[] args) {

        int x = 11, y = 3, z = 6;

        System.out.println(x > y && y > z); //false
        System.out.println(y < z || x == y); //true
        System.out.println(!(x > y)); //false
    }
}
