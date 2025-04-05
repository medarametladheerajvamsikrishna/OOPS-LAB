// Parent class
class Appliance {
    void consumeElectricity() {
        System.out.println("Appliance consumes electricity.");
    }
}

// Child class 1
class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing Machine is washing clothes.");
    }
}

// Child class 2
class Refrigerator extends Appliance {
    void keepFoodFresh() {
        System.out.println("Refrigerator keeps food fresh.");
    }
}

// Main class to test Hierarchical Inheritance
public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.consumeElectricity(); // Inherited from Appliance
        wm.washClothes();        // Own method

        Refrigerator fridge = new Refrigerator();
        fridge.consumeElectricity(); // Inherited from Appliance
        fridge.keepFoodFresh();      // Own method
    }
}
