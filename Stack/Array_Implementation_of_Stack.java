package Stack;


class MyStack{
        int arr[];
        int cap;
        int top;
        MyStack(int c){
            top=-1;
            cap=c;
            arr=new int[c];
        }
        void push(int x){
            top++;
            arr[top]=x;
        }
        int pop(){
            int res=arr[top];
            top--;
            return res;
        }
        int size(){
            return top+1;
        }
        boolean isEmpty(){
            return (top==-1);
        }
    }

public class Array_Implementation_of_Stack {

    
    public static void main(String[] args) {
        MyStack stack=new MyStack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        int size=stack.size();
        System.out.println(size);
        while(!stack.isEmpty()){
           System.out.println(stack.pop());
        }
        
    }
    
}


