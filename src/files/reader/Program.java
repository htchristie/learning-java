package files.reader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\017665631\\Downloads\\hi.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
