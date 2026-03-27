class Parent{
    int x=10;
    void display(){
        System.out.println("I am inside parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("I am inside child class");
    }
}


public class SimpleInheritance {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        Parent p = new Parent();
        p.display();
        Parent pa=new Child();
        pa.display();
    }
}