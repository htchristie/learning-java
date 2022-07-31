package conditional_structure;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Enter a number between 1 and 7");
        }

        scan.close();
    }
}
