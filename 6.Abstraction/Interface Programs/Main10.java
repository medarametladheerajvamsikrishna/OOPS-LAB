interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class Main10 {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("Add: " + calc.add(10, 5));         // 15
        System.out.println("Subtract: " + calc.subtract(10, 5)); // 5
    }
}
