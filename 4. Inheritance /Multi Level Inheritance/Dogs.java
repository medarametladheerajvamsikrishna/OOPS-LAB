class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Dogs {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.walk();
        myDog.bark();
    }
}
