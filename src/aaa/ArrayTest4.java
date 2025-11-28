package aaa;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 7;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 1;
        arr[4] = 8;
        arr[5] = 3;
        arr = insert(arr,6,2); //在arr[2]的位置插入元素为6的数
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    /* @param arr:表示要插入的数组
     * @param element：要插入的数据元素
     * @param index: 要插入的下标位置
     * @return
     */
    public static int[] insert(int[] arr,int element,int index){
        if (index<0 || index>arr.length){
            throw new IndexOutOfBoundsException("超出数组实际元素范围");
        }
        //从当前index向右依次把元素逐个挪动一位
        for(int i=arr.length-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        //腾出的地方位置放入新元素
        return arr;
    }
}
