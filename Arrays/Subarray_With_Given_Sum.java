package Arrays;

public class Subarray_With_Given_Sum {
    /*
       * There is NO NEGATIVE ELEMENT  in the array
    */

    /*
      * Naive Solution
      * Consider every Subarray
      * Time:- O(n^2)
      * Auxiliary Space :- O(1)
    */

    public boolean isSubSum(int arr[],int sum){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr+=arr[j];
                if(curr==sum){
                    return true;
                }
            }
        }
        return false;
    }

    /*
       *Idea for Efficient Solution
       -->We use window Sliding technique with a window of variable size;
       [1,4,20,3,10,5] , Sum=33
       s=0,e=0,curr=1
       s=0,e=1,curr=1
       s=0,e=2,curr=1    While sum is smaller than sum 
       s=0,e=3,curr=1    extend the window by increasing e...
       s=0,e=4,curr=1
x-----------------------------------x
       s=1,e=4,curr=1    While curr is greater than sum 
       s=2,e=4,curr=1    shrink the window by increasing e...
    */

    //Time:- O(n)
    //Auxiliary Space :- O(1)
    public static boolean isSubSum_Efficiently(int arr[],int sum){
        int n=arr.length;
        int s=0;
        int curr=0;
        for(int e=0;e<n;e++){
            curr+=arr[e];
            while(sum<curr){
                curr-=arr[s];
                s++;
            }
            if(curr==sum){
                return true;
            }
        }
        return false;
    }
}
