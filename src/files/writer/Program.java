package files.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"I'm", "a", "new", "line"};

        String path = "C:\\Users\\017665631\\Downloads\\bye.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for (String line: lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
