package Arrays;

public class Leaders_in_Array {

     /* 
         * A Element is leader in Array if it is greater than all of elements left side of it
         * For Sorted Array (Increasing Order) only last element is leader
         * For Sorted Array (decreasing Order) All elements(Unique) are leader
     */

     //Naive Solution 
     //Time :- O(n*n)
     //Auxiliary Space :- O(1)

     public static void leaders(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                System.out.println(arr[i]);
            }
        }
     }

     /*
      * Efficient Solution :- 
                For a Element to be leader it should be the maximum (unique)
                of all the elements after that(Right Side)
      */
      //Time :- 0(n)

    public static void leaders_Efficiently(int arr[],int n){
        int curr_leader=arr[n-1];
        System.out.println(curr_leader);
        for(int i=n-2;i>=0;i--){
            if(curr_leader<arr[i]){
                curr_leader=arr[i];
                System.out.println(curr_leader);
            }
        }
    }
     public static void main(String[] args) {
          
     }
}
