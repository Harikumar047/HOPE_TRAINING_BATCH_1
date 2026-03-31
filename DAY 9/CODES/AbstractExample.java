abstract class Payment {
    abstract void pay(int amount);

    void receipt() {
        System.out.println("Payment processed");
    }
}

class UPI extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard extends Payment {
    void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

public class Abstractexample {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay(1000);
        p.receipt();

        p = new CreditCard();
        p.pay(2000);
        p.receipt();
    }
}