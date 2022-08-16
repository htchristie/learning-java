package files.folders;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter folder path: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder: folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file: files) {
            System.out.println(files);
        }

        boolean success = new File(strPath + "\\testdir").mkdir();
        System.out.println("Directory creation sucessfull: " + success);

        scan.close();
    }
}
