class OneBHK {
    void details() {
        System.out.println("Apartment: 1 BHK");
        System.out.println("Restroom: Common");
        System.out.println("Playground: Common");
        System.out.println("Dining: Common");
    }
}


class TwoBHK {
    void details() {
        System.out.println("\nApartment: 2 BHK");
        System.out.println("Restroom: Attached");
        System.out.println("Playground: Common");
        System.out.println("Dining: Common");
    }
}


class FourBHK {
    void details() {
        System.out.println("\nApartment: 4 BHK");
        System.out.println("Restroom: Attached");
        System.out.println("2 Bedrooms -> 1 Hall");
        System.out.println("Kitchen: Yes");
        System.out.println("Playground: Common");
        System.out.println("Dining: Common");
    }
}


public class classObject {
    public static void main(String[] args) {
        OneBHK a1 = new OneBHK();
        TwoBHK a2 = new TwoBHK();
        FourBHK a3 = new FourBHK();

        a1.details();
        a2.details();
        a3.details();
    }
}