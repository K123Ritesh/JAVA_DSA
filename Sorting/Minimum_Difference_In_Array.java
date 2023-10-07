package Sorting;

import java.util.Arrays;

public class Minimum_Difference_In_Array {

    //Time:- O(n^2)
    //Auxiliary Space:- O(1)
    public static int Minimum_Difference_Naive(int arr[],int n){
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res=Math.min(res,Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }
    /*
        Efficient Solution:-
          A.Sort the array
          B.Compute the differences between the adjacent elements
          C.And at last return the minimum difference
        Time:-O(nlog(n)) [Due To sorting]
     */
    public static int Minimum_Difference_Efficiently(int arr[],int n){
        Arrays.sort(arr);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res=Math.min(res,Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
}
