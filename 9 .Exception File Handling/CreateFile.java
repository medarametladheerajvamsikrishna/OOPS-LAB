import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello, this is a new file.\n");
            writer.write("This is the second line.");
            writer.close();
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
