package Sorting;

public class Insertion_Sort {
    /*
        -->O(n^2) Algorithm
        -->In-Place and Stable 
        -->Used in Practice for small Arrays(Tim Sort and Intro Sort )
        -->O(n) in best case(When Already Sorted)
     */

     public static void insertion_Sort(int arr[],int n){
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
     }
}
