package hashcodeAndEquals.exampleHashcode;

public class Program {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Pedro";

        //returns a integer number representing a hash code generated from the object
        System.out.println(a.hashCode()); // 74113750
        System.out.println(b.hashCode()); // 76990316
    }
}
