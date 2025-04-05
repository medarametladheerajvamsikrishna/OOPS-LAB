interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();
        d1.draw();  // Drawing a circle
        d2.draw();  // Drawing a rectangle
    }
}
