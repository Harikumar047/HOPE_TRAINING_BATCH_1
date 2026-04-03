public class Wrapper {
    public static void main(String[] args) {
        String strInt = "1000";
        String strDouble = "3.5";
        String strBool = "true";
        String strChar = "A";
        int i = Integer.parseInt(strInt);      
        double d = Double.parseDouble(strDouble); 
        boolean b = Boolean.parseBoolean(strBool); 
        char c = strChar.charAt(0);            
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("Char: " + c);
    }
}