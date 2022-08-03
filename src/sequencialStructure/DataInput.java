package sequencialStructure;

import java.util.Locale;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in); //instantiates scanner object

        String name;
        int age;
        double height;
        char gender;
        String msg;

        System.out.println("What is your name?");
        name = scan.next(); // scans string
        System.out.println("Pleasure to meet you, " + name + "! How old are you?");
        age = scan.nextInt(); // scans int
        System.out.println("You're " + age + " years old, I see. What about your height (in meters - numbers only)?");
        height = scan.nextDouble(); // scans double
        System.out.println("You're " + height + "m tall? Not quite what I expected, but that's alright. One last question - what is your gender (F or M)?");
        gender =  scan.next().charAt(0); // scans char
        System.out.println("I figured you'd be a " + gender + ". Would you like to leave a message?");
        scan.nextLine(); // consumes the end of line from previous input
        msg = scan.nextLine(); // scans until user hits enter
        System.out.println("Your message '" + msg + "' has been stored in our database. Thank you.");
        System.out.println("Cool! That's it for now! We'll see each other again soon.");
        scan.close(); // you should always close the scanner when you no longer need it
    }
}
