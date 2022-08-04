package oopExercises.exerciseThree.application;

import oopExercises.exerciseThree.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        student.name = scan.nextLine();
        student.grade1 = scan.nextDouble();
        student.grade2 = scan.nextDouble();
        student.grade3 = scan.nextDouble();

        System.out.println(student);
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASSED");
        }

        scan.close();
    }
}
