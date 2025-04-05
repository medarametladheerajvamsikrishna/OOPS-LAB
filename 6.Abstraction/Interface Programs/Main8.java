interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Output: Car is starting...
    }
}
