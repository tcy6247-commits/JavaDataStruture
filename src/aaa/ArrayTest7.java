package aaa;

import java.util.Arrays;

public class ArrayTest7 {
    public static void main(String[] args) {
        int[] arr1 = {8, 2, 7, 3, 1};
        int[] arr2 = {8, 7, 2, 1, 3};
        System.out.println(Arrays.equals(arr1,arr2)); //判断数组中的元素及元素的顺序
        System.out.println(Arrays.toString(arr1)); //打印数组的字符串表现形式


        Arrays.sort(arr1);   //按升序对指定数组进行排序
        System.out.println(Arrays.toString(arr1)); //打印升序排序后的数组
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] newArr = Arrays.copyOf(arr1, arr1.length+3);
        System.out.println(Arrays.toString(newArr));
    }
}
