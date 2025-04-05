import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultiPackageExample {
    public static void main(String[] args) {
        ArrayList<String> logs = new ArrayList<>();
        logs.add("User logged in");
        logs.add("User viewed profile");
        logs.add("User logged out");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            FileWriter writer = new FileWriter("log.txt", true); // append mode

            writer.write("----- Log Entry: " + now.format(formatter) + " -----\n");
            for (String log : logs) {
                writer.write(log + "\n");
            }
            writer.write("-------------------------------------\n\n");

            writer.close();
            System.out.println("Logs written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
