package arraysAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {

        /*
        Lists are data structures
        - homogeneous (same type)
        - ordered
        - preserves the insertion order
        - allocated on demand
        */

        List<Integer> list = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.add(1, 5);
        System.out.println(list);

        list.removeIf(x -> x < 5);
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.removeAll(list);
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            listB.add(i);
        }

        System.out.println("----------");
        System.out.println(list);
        System.out.println(listB);

        list.removeAll(listB);
        System.out.println(list);
        System.out.println(list.indexOf(4));

        System.out.println("----------");

        List<Integer> test = listB.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(test);

        Integer number = list.stream().filter(x -> x > 1).findFirst().orElse(null);
        System.out.println(number);

        Integer number2 = list.stream().filter(x -> x > 4).findFirst().orElse(null);
        System.out.println(number2);
    }
}
