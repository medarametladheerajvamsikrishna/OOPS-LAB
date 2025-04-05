abstract class Bank {
    abstract double getRateOfInterest();
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 6.5;
    }
}

public class Main12 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Interest Rate: " + b.getRateOfInterest());
    }
}
