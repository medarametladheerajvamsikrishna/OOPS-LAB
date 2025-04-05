abstract class Payment {
    abstract void makePayment();
}

class CreditCard extends Payment {
    void makePayment() {
        System.out.println("Payment made using credit card");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.makePayment();
    }
}
