import java.io.*;

public class UpdateFile {
    public static void main(String[] args) {
        String oldContent = "";
        String newContent = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                oldContent += line + "\n";
            }
            reader.close();

            // Example: Replace "Hello" with "Hi"
            newContent = oldContent.replaceAll("Hello", "Hi");

            FileWriter writer = new FileWriter("data.txt");
            writer.write(newContent);
            writer.close();

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
