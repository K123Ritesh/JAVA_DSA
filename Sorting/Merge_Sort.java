package Sorting;

public class Merge_Sort {
    /*
       --> Divide and Conquer Algorithm
       --> Stable Algorithm
       --> O(nlog(n)) Time and O(n) Auxiliary Space
       --> Well Suited for Linked-Lists ,works in O(1) Auxiliary Space
       --> Used in External Sorting
       --> In General for Arrays ,QuickSort outperforms it.
     */

     public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int [n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
     }

     public static void merge_Sort(int arr[],int l,int r){
        if(r > l){  //At least Two Elements....
            int mid=l+(r-l)/2; // (l+r) / 2
            merge_Sort(arr, l, mid);
            merge_Sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
     }
}
