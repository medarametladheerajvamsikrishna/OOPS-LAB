// Parent class
class Bank {
    double getRate() {
        return 5.0; // Default interest rate
    }
}

// Child class 1
class SBI extends Bank {
    @Override
    double getRate() {
        return 6.5;
    }
}

// Child class 2
class HDFC extends Bank {
    @Override
    double getRate() {
        return 7.0;
    }
}

// Child class 3
class ICICI extends Bank {
    @Override
    double getRate() {
        return 7.5;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println("SBI Interest Rate: " + bank1.getRate() + "%");

        Bank bank2 = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank2.getRate() + "%");

        Bank bank3 = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank3.getRate() + "%");
    }
}
