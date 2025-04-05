abstract class Transport {
    abstract void move();
}

class Bus extends Transport {
    void move() {
        System.out.println("Bus moves on road");
    }
}

public class Main13 {
    public static void main(String[] args) {
        Transport t = new Bus();
        t.move();
    }
}
