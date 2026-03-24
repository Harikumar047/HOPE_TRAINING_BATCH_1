import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the operator :");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':System.out.println("Sum of a+b is : "+(a+b));
                     break;
            case '-':System.out.println("Difference of a-b is : "+(a-b));
                     break;
            case '*':System.out.println("Multiplication of a*b is : "+(a*b));
                     break;
            case '/':System.out.println("Division of a/b is : "+(a/b));
                     break;
            case '%':System.out.println("Modulus of a%b is : "+(a%b));
                     break;
        }
    }
}