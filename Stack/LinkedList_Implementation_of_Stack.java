package Stack;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
public class LinkedList_Implementation_of_Stack {
    Node head;
    int size;
    LinkedList_Implementation_of_Stack(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    int peek(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

}
