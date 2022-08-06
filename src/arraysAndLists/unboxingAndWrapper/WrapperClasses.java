package arraysAndLists.unboxingAndWrapper;

public class WrapperClasses {
    public static void main (String[] args) {

        /*
        Boolean - boolean
        Character - char
        Byte - byte
        short - short
        Integer - int
        Long - long
        Float - float
        Double - double

        primitive types as classes
        wrapper classes accept null as value
        */

        int x = 20;
        Integer obj = x;
        int y = obj; // casting is not needed
        System.out.println(y);
    }
}
