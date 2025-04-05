class DisplayMessage {
    // Method 1: No parameters
    void display() {
        System.out.println("Hello, World!");
    }

    // Method 2: One parameter
    void display(String message) {
        System.out.println("Message: " + message);
    }

    // Method 3: Two parameters
    void display(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Message: " + message);
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        
        dm.display();
        dm.display("Java is awesome!");
        dm.display("Method Overloading", 3);
    }
}
