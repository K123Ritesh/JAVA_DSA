package Searching;

public class Triplets_In_Sorted_Array {
    //Naive Solution 
    //Time:-O(n^3)
    //Auxiliary Space:-O(1)
    public static boolean isTriplet(int arr[],int n,int x){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * Idea for Efficient Solution 
          Time:-O(n^2)
          Auxiliary Space:-O(1)
        Hint:-Use Pair sum Problem as a subroutine
        Steps:-
           1.Traverse the array from left to right
           2.for every element arr[i],check if there is a pair on right-side with sum=(x-arr[i])
     */

    public static boolean isTriplet_Efficiently_Helper(int arr[],int n,int x,int si){
        int i=si,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }else if(arr[i]+arr[j]<x){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    public static boolean isTriplet_Efficiently(int arr[],int n,int x){
        for(int i=0;i<n-2;i++){
            if(isTriplet_Efficiently_Helper(arr,n,x-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }
}
