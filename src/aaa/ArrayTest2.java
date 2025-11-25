package aaa;

public class ArrayTest2 {
    public static void main(String[] args) {
        //数据类型[] 数组名称 = new 数据类型[长度]；
        int[] arr = new int[5];
        //System.out.println(arr.length); //输出arr的长度
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]); //输出arr默认的值 0
        }

        //声明数组
        //数据类型 [] 数组名称 = null;
        //开辟数组空间：
        //数组名称 = new 数据类型[长度];
        int[] arr2 = null;
        System.out.println(arr2[2]);
        arr2 = new int[5];
        System.out.println(arr2[5]);



    }




}

