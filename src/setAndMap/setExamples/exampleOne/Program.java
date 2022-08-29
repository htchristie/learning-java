package setAndMap.setExamples.exampleOne;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // HashSet does not maintain any order

        set.add("Wristwatch");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook")); // true
        System.out.println();

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        Set<String> set2 = new TreeSet<>();
        // Objects in a TreeSet are stored in a sorted and ascending order

        set2.add("Wristwatch");
        set2.add("Notebook");
        set2.add("Tablet");

        for (String p : set2) {
            System.out.println(p);
        }

        System.out.println();

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        Set<String> set3 = new LinkedHashSet<>();
        // ordered version of HashSet that maintains a doubly-linked List across all elements
        // maintains insertion order

        set3.add("Wristwatch");
        set3.add("Notebook");
        set3.add("Tablet");

        for (String p : set3) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        set3.remove("Tablet");
        set3.removeIf(x -> x.length() > 8);

        for (String p : set3) {
            System.out.println(p);
        }



    }
}
