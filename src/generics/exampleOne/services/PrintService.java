package generics.exampleOne.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    // A generic type is a generic class or interface that is parameterized over types
    private List<T> values = new ArrayList<>();

    public void addValue(T value) {
        values.add(value);
    }

    public T first() {
        if (values.isEmpty()) {
            throw new IllegalStateException("List is empty.");
        }

        return values.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!values.isEmpty()) {
            System.out.print(values.get(0));
        }

        for (int i = 1; i < values.size(); i++) {
            System.out.print(", " + values.get(i));
        }
        System.out.println("]");
    }
}
