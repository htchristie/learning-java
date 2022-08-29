package hashcodeAndEquals.example.application;

import hashcodeAndEquals.example.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Pedro", "pedro@gmail.com");
        Client c3 = new Client("Maria", "maria2@gmail.com");
        Client c4 = new Client("Pedro", "pedro@gmail.com");

        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(c3)); // false
        System.out.println(c2.equals(c4)); // true
        System.out.println(c2 == c4); // false; compares memory positions
    }
}
