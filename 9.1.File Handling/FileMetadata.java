import java.io.File;

public class FileMetadata {
    public static void main(String[] args) {
        File file = new File("data.txt");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
