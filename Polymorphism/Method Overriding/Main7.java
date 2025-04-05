// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls parent method

        Animal myDog = new Dog();
        myDog.sound(); // Calls overridden method in Dog

        Animal myCat = new Cat();
        myCat.sound(); // Calls overridden method in Cat
    }
}
