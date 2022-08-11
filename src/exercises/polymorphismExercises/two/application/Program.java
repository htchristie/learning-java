package exercises.polymorphismExercises.two.application;

import exercises.polymorphismExercises.two.entities.LegalEntity;
import exercises.polymorphismExercises.two.entities.NaturalPerson;
import exercises.polymorphismExercises.two.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tax payers: ");
        int N = scan.nextInt();
        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char answer = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            double income = scan.nextDouble();

            if (answer == 'i') {
                System.out.print("Health expenditures: ");
                double expenditures = scan.nextDouble();

                people.add(new NaturalPerson(name, income, expenditures));
            } else if (answer == 'c') {
                System.out.print("Number of employees: ");
                int employees = scan.nextInt();

                people.add(new LegalEntity(name, income, employees));
            } else {
                System.out.println("Unknown answer. Please try again.");
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (Person person: people) {
            sum += person.calculateTaxes();
            System.out.println(person);
        }

        System.out.printf("TOTAL TAXES: %.2f%n", sum);
        scan.close();
    }
}
