class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area = πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area = length × width");
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area = ½ × base × height");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.area();

        Rectangle rect = new Rectangle();
        rect.draw();
        rect.area();

        Triangle tri = new Triangle();
        tri.draw();
        tri.area();
    }
}
