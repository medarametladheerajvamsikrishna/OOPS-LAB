class AreaCalculator {
    // Method 1: Area of Square
    int calculateArea(int side) {
        return side * side;
    }

    // Method 2: Area of Rectangle
    int calculateArea(int length, int width) {
        return length * width;
    }

    // Method 3: Area of Circle
    double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class Main5 {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        
        System.out.println("Area of Square: " + ac.calculateArea(5));
        System.out.println("Area of Rectangle: " + ac.calculateArea(4, 6));
        System.out.println("Area of Circle: " + ac.calculateArea(3.5));
    }
}
