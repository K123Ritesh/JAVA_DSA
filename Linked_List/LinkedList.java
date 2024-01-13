package Linked_List;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        next=null;
    }
}

class LinkedList{
    ListNode head=null;
    int size;
    void addFirst(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=temp;
            
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
        return ;
    }

    void addLast(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=temp;
        }
        else{
            ListNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    ListNode removeFirst(){
        if(head==null||head.next==null){
            head=null;
            return null;
        }
        head=head.next;
        return head;
    }

    ListNode removeLast(){
        if(head==null || head.next==null){
            head=null;
            return null;
        }
        ListNode curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
        
    }
    int size(){
        return size;
    }
    void printList(){
        ListNode curr=head;
        System.out.print(curr.data);
        while(curr.next !=null){
            System.out.print(" -> "+curr.next.data);
            curr=curr.next;
        }
        System.out.print(" -> NULL  ");
        return ;
    }
}

class Solution{
    public static void main(String[] args) {
        ListNode node=new ListNode(0);
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(14);
        list.addLast(12);

        list.removeFirst();
        list.removeLast();
        
        list.printList();

    }
}