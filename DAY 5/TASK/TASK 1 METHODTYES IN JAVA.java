Four types of methods :-

class MethodTypes{

    // 1. No parameters, no return value
    void method1() {
        System.out.println("Method 1: No parameters, No return value");
    }

    // 2. With parameters, no return value
    void hello(String name) {
        System.out.println("Hello "+name);
    }

    // 3. No parameters, with return value
    String greeting(){
        return "Welcome!";
    }

    // 4. With parameters, with return value
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        MethodTypes obj = new MethodTypes();

        // Calling method - No parameters, no return value
        obj.method1();

        // Calling method - With parameters, no return value
        obj.hello("Dhivya");

        // Calling method - No parameters, with return value
        System.out.println(obj.greeting());

        // Calling method - With parameters, with return value
        System.out.println("Multiplication of 4 and 5 is "+obj.multiply(4,5));
    }
}