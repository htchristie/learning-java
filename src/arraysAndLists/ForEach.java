package arraysAndLists;

public class ForEach {
    public static void main (String[] args) {

        String[] names = new String[] {"Maria", "Bob", "Alex"};

        for (String name : names) { // (Type element : array)
            System.out.println(name);
        }
    }
}
