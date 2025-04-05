// Hybrid Inheritance - Chef, Waiter, and Restaurant
interface Chef {
    void prepareFood(String foodItem);
}

interface Waiter {
    void serveFood(String foodItem);
}

class Restaurant implements Chef, Waiter {
    @Override
    public void prepareFood(String foodItem) {
        System.out.println("Chef is preparing " + foodItem);
    }

    @Override
    public void serveFood(String foodItem) {
        System.out.println("Waiter is serving " + foodItem);
    }

    public void manageOrder(String foodItem) {
        prepareFood(foodItem);
        serveFood(foodItem);
    }
}

public class HybridInheritance_ChefWaiter {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.manageOrder("Pasta");
    }
}