public class IntegerCache {
    public static void main(String[] args) {
        Float f1=127f;
        Float f2=127f;
        System.out.println(f1==f2);//false
        Integer x=200;
        Integer y=200;
        System.out.println(x==y);//false
        Integer a=127;
        Integer b=127;
        System.out.println(a==b);//true
    }
}
// Reason : the Integer Cache
// int only have this range -128 to 127 other dont follow it !