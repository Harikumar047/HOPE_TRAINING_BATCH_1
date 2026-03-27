class Animal{
    void display1(){
        System.out.println("This is an animal");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("This is a dog");
    }
}
class Puppy extends Dog{
    void display3(){
        System.out.println("This is puppy");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.display3();
        p.display();
        
    }
}