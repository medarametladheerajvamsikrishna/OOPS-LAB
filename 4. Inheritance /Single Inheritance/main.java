class Person {
    String name;

    void setName(String n) {
        name = n;
    }

    void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

class Student extends Person {
    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");
        s.greet();
        s.study();
    }
}
