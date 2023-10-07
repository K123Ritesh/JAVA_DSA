package Arrays;

public class Sliding_Window_Technique {
     
     //Quesition :- Find the Maximum sum of K consecutive Elements in a Array

     //Naive Solution 
     //Time:- O(n x k)
     //Auxiliary Space :- O(1)
     public static int maxSum(int arr[],int n,int k){
          int res=Integer.MIN_VALUE;
          for(int i=0;i+k-1<n;i++){
               int curr=0;
               for(int j=0;j<k;j++){
                    curr+=arr[i+j];
               }
               res=Math.max(res,curr);
          }
          return res; 
     }

    /* Idea of Sliding Window :- Compute Sum of Current Window using the sum of Previous Window in O(1) Time
        (Add last of the current window and Remove First of the Previous Window)                     
    */

    public static int getMaxKSum(int arr[],int n,int k){
          int curr=0;
          for(int i=0;i<k;i++){
               curr+=arr[i];
          }
          int res=curr;
          for(int i=k;i<n;i++){
               curr=curr+arr[i]-arr[i-k];
               res=Math.max(res,curr);
          }
          return res;
    }
}
