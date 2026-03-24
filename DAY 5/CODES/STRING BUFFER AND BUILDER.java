public class StringBuilderAndBuffer{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        StringBuffer str=new StringBuffer("Hello");
        System.out.println(str);
        sbf.append(" World");
        System.out.println(str);

        //builder is not safe and buffer is safe
    }
}