class Car {
    String brand;
    int speed;

    // Default constructor
    Car() {
        brand = "Unknown";
        speed = 0;
        System.out.println("Car brand not specified.");
    }

    // Constructor with one parameter
    Car(String b) {
        brand = b;
        speed = 0;
        System.out.println("Car Brand: " + brand);
    }

    // Constructor with two parameters
    Car(String b, int s) {
        brand = b;
        speed = s;
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car car1 = new Car();              // Default constructor
        Car car2 = new Car("Toyota");      // Constructor with 1 parameter
        Car car3 = new Car("BMW", 200);    // Constructor with 2 parameters
    }
}
