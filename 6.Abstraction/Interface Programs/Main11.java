interface Animal {
    void eat();
}

interface Bird extends Animal {
    void fly();
}

class Eagle implements Bird {
    public void eat() {
        System.out.println("Eagle eats meat.");
    }

    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

public class Main11 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
    }
}
