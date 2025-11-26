package aaa;

public class ArrayTest6  {
    public static void main(String[] args) {
        int[] arr = {8,2,7,3,1,9};
        arr = delete(arr,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
    /**
    * @param arr ：要操作的数组
    * @param index : 要删除的元素下标
    * @return

     */

    public static int[] delete(int[] arr,int index){
        if(index<0 || index>arr.length){
            throw new IndexOutOfBoundsException("下标超出了数组的范围");

        }
        arr[index] = arr[arr.length-1];
        int[] newArr = new int[arr.length-1];
        for (int i=0;i<newArr.length;i++) {
            newArr[i] = arr[i];
        }
        return newArr;


    }



}
