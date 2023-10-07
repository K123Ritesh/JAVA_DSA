package Sorting;

import java.util.Arrays;

public class Kth_Smallest_Element {
    // k<=size of the array
    public static int Kth_Smallest(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    /*
        Idea for Optimised Solution
           1. Parttition the array arround a pivot 
                p = partition(arr,low,high)
           2. If p==k-1
                 return arr[p]
              else if p > k-1
                 high=p-1
              elae
                 low=p+1
     */
    public static int Kth_Smallest_Efficient(int arr[],int n,int k){
        int lo=0,high=n-1;
        while(lo<=high){
            int p=Quick_Sort.Hoare_Partition(arr, lo, high);
            if(p==k-1){
                return arr[p];
            }else if(p>k-1){
                high=p-1;
            }else{
                lo=p+1;
            }
        }
        return -1;
    }
}
