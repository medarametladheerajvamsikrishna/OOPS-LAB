import java.io.*;
import java.util.*;

public class UpdateLineInFile {
    public static void main(String[] args) {
        String filePath = "data.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("oldword")) {
                    line = line.replace("oldword", "newword");
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing the file.");
        }
    }
}
