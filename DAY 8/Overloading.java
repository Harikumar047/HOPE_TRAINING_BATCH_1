class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
        System.out.println(m.add(2.5, 3.5));
    }
}