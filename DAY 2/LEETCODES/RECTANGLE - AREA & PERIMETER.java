import java.util.*;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();  
        System.out.print("Area of rectangle is: "+" "+ (l*b));
        sc.close();
    }
}
///////////////////////////////////////////////////////////////////
import java.util.*;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();  
        System.out.print("Perimeter of rectangle is: "+" "+ (2*(l+b)));
        sc.close();
    }
}