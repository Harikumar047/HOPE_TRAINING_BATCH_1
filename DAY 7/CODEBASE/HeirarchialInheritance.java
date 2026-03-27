class Father {
    void father() {
        System.out.println("I'm the Father");
    }
}

class Son extends Father {
    void son() {
        System.out.println("I'm the Son");
    }
}

class Daughter extends Father {
    void daughter() {
        System.out.println("I'm the Daughter");
    }
}
public class HeirarchialInheritance {
    public static void main(String [] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        son.father(); 
        daughter.father(); 
    }
}
