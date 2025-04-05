abstract class Person {
    abstract void role();
}

class Teacher extends Person {
    void role() {
        System.out.println("Teaches students");
    }
}

public class Main15 {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.role();
    }
}
