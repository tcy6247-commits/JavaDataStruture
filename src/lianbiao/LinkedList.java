package lianbiao;

public class LinkedList {
    //头节点指针
    private Node head;
    //尾节点指针
    private Node tail;
    //链表的实际长度
    private int size;


    /**
     * 链表查找元素方法
     * @param index:查找的位置
     * @return
     */
    private Node get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("超出了链表的节点范围");
        }
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    /**
     * 链表插入元素
     * @param index：插入元素位置
     * @param data: 插入的元素
     */

    private void insert(int index,int data){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("超出链表的节点范围");
        }
        Node insertNode = new Node(data);
        if(size==0){
            //空链表
            head = insertNode;
            tail = insertNode;
        }else if(index==0){
            //插入头部
            insertNode.next = head;
            head = insertNode;
        }else if(index==size){
            //插入尾部
            tail.next = insertNode;
            tail = insertNode;
        }
    }


    private  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
