package beecrowdExercises;

import java.util.Scanner;

public class Bee1046 {
    public static void main(String[] args) {

        /*
        Read the start time and end time of a game, in hours. Then calculate the duration of the game,
        knowing that the game can begin in a day and finish in another day, with a maximum duration
        of 24 hours. The message must be printed in portuguese “O JOGO DUROU X HORA(S)” that means
        “THE GAME LASTED X HOUR(S)”

        Input
        Two integer numbers representing the start and end time of a game.

        Output
        Print the duration of the game as in the sample output.
        */

        Scanner scan = new Scanner(System.in);

        int startTime = scan.nextInt();
        int endTime = scan.nextInt();
        int duration;

        if (endTime > startTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.println("O JOGO DUROU " + duration + " HORAS");
        scan.close();
    }
}
