package exercises.arrayExercises.height.application;

import exercises.arrayExercises.height.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people should be considered?");
        int N = scan.nextInt();
        scan.nextLine();

        Person[] people = new Person[N];
        int aux = 0;
        double sum = 0, avg, minorsPercent;

        for (int i = 0; i < people.length; i++) {
            String name = scan.nextLine();
            int age = scan.nextInt();
            double height = scan.nextDouble();
            scan.nextLine();
            people[i] = new Person(name, age, height);
        }

        for (int j = 0; j < people.length; j++) {
            sum += people[j].getHeight();

            if (people[j].getAge() < 16) {
                aux++;
            }

            System.out.println("Person " + (j+1) + ":");
            System.out.println(people[j]);
        }

        minorsPercent = ((double) aux / N) * 100.0;
        avg = sum / people.length;
        System.out.printf("Average height: %.2f%n", avg);

        System.out.println("People younger than 16 years old: " + minorsPercent + "%");

        for (int k = 0; k < people.length; k++) {
            if (people[k].getAge() < 16) {
                System.out.println(people[k].getName());
            }
        }

        scan.close();
    }
}
