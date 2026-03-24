public class ArrayMemoryAllocation {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr2.hashCode());
        Integer[] arr3={1,2,3};
        System.out.println(arr3);
        System.out.println(arr3);
        System.out.println(arr3[0].hashCode()==1);
        Double[] arr4=new Double[]{};
        System.out.println(arr4);
        String[] arr5={"Hello","World"};
        System.out.println(arr5);
        System.out.println(arr5.hashCode());
        boolean[] arr6={true,false,true};
        System.out.println(arr6);
        System.out.println(Integer.toHexString(arr6.hashCode()));
    }
}