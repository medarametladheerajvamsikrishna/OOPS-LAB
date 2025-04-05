class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("SportsCar activates turbo boost!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();       // Inherited from Vehicle
        sc.drive();       // Inherited from Car
        sc.turboBoost();  // Defined in SportsCar
    }
}
