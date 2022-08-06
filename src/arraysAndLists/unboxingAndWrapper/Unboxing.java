package arraysAndLists.unboxingAndWrapper;

public class Unboxing {
    public static void main (String[] args) {

        // value -> reference or reference -> value

        int x = 7;
        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);
    }
}
