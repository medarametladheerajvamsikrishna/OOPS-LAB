import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("destination.txt")) {

            int content;
            while ((content = in.read()) != -1) {
                out.write(content);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error during copy: " + e.getMessage());
        }
    }
}
