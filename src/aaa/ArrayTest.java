package aaa;

public class ArrayTest {
    public static void main(String[] args) {
        //简化形式
        int[] arr = {5,1,7,4,8};
        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
        }
        //完整形式
        int[] arr2 = new int[]{1,4,5,7,8};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
