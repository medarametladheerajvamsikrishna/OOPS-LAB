import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchInFile {
    public static void main(String[] args) {
        String wordToFind = "Java";
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToFind)) {
                    System.out.println("Found \"" + wordToFind + "\" on line " + lineNumber + ": " + line);
                    found = true;
                }
                lineNumber++;
            }

            if (!found) {
                System.out.println("Word not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
