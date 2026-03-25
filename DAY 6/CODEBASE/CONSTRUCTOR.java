class Apartment{
    String type;
    Apartment(String type){
        this.type = type;
    }
    void display(){
        System.out.println("Apartment Type: " + type);
        if(type.equals("1BHK")){
            System.out.println("1 Bedroom");
            System.out.println("Common Restroom");
        } 
        else if(type.equals("2BHK")){
            System.out.println("2 Bedrooms");
            System.out.println("Attached Restroom");
        } 
        else if(type.equals("4BHK")){
            System.out.println("4 Bedrooms");
            System.out.println("Attached Restroom");
            System.out.println("Hall for every 2 bedrooms");
            System.out.println("Kitchen included");
        }
        System.out.println("Common Playground");
        System.out.println("Common Dining");
    }
}

public class ApartmentBuilding{
    public static void main(String[] args) {
        Apartment a1 = new Apartment("1BHK");
        Apartment a2 = new Apartment("2BHK");
        Apartment a3 = new Apartment("4BHK");
        a1.display();
        a2.display();
        a3.display();
    }
}