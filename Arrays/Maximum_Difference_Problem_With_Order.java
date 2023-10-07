package Arrays;

public class Maximum_Difference_Problem_With_Order {
     
     /*
      * Quesition:- Maximum value of arr[j]-arr[i] such that j>i
     */
    //Naive Solution
    //Time :- O(n^2)
    public static int maxDiff(int arr[],int n){
        int res=arr[1]-arr[0];
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
               res=Math.max(res,arr[j]-arr[i]);
          }
        }
        return res;
    }

     //Efficient Solution
    //Time :- O(n)
    /*
     * As We have  to maximise the arr[j]-arr[i] so if we minimize the arr[i] then it will help us.... 
     */
    public static int maxDiff_Efficiently(int arr[],int n){
          int res=arr[1]-arr[0];
          int minVal=arr[0];
          for(int j=1;j<n;j++){
               res=Math.max(res,arr[j]-minVal);
               minVal=Math.min(minVal,arr[j]);
          }
          return res;
    }
}
