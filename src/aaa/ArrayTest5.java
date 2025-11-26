package aaa;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = {8,2,7,3,1};
        //新数组长度=原数组长度+要插入的元素个数
        int[] newArr = new int[arr.length+1];
       // System.out.println(newArr.length);
        //把原数组中的每个元素，同步赋值到新数组的相同位置上
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        //把插入的元素赋值给新数组末尾
        newArr[newArr.length-1] = 9;
        for (int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }


}
