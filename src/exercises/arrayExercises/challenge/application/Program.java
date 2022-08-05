package exercises.arrayExercises.challenge.application;

import exercises.arrayExercises.challenge.entities.Renter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int quantity = scan.nextInt();
        Renter[] rooms = new Renter[10];
        scan.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Room: ");
            int room = scan.nextInt();
            scan.nextLine();

            rooms[room] = new Renter(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j] != null) {
                System.out.println(rooms[j]);
            }
        }


        scan.close();
    }
}
