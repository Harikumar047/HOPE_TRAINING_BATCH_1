class Animal{
    void display(){
        System.out.println("There is a animal");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog sound=new Dog();
        sound.bark();
        sound.display();
        
    }
}