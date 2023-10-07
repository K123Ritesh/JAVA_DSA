package Sorting;

public class Sort_An_Array_With_Three_Types_Of_Elements {
    /*
        Type 1. Sort an Array of 0's 1's and 2's 
        Type 2. Three way Partitioning
        Type 3. Partition Arround a Range
     */

     // Naive Approach
     // Time :- 0(n)
     // Auxiliary Space :- 0(n)

     public static void sort_Naive(int arr[],int n){
        int temp[]=new int[n];
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]==1){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]==2){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            arr[j]=temp[j];
        }
     }

     /*
         Efficient Solution:-
           Dutch National Flag Algorithm
        Time :- 0(n)
        Auxiliary Space :- O(1)
      */
      public static void sort_Efficient(int arr[],int n){
        int lo=0,hi=n-1,mid=0;
        while(mid<=hi){
            if(arr[mid]==0){
                //swap(arr[low],arr[mid])
                int temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                // swap(arr[mid],arr[hi])
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
      }
}
