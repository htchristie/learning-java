package setAndMap.setExamples.exampleThree.application;

import setAndMap.setExamples.exampleThree.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> logEntries = new HashSet<>();
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logEntries.add(new LogEntry(username, moment));
                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + logEntries.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        scan.close();
    }
}
