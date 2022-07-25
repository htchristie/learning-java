package conditional_structure;

import java.util.Scanner;

public class ConditionalStructure {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("How old are you?");
        age = scan.nextInt();

        if (age < 18) {
            System.out.println("You're a minor");
        } else {
            System.out.println("You're an adult");
        }

        scan.close();
    }
}
