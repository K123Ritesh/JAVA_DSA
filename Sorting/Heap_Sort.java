package Sorting;

public class Heap_Sort {
    /*
       Step.1 Build a Max-Heap
       Step.2 Repeatedly swap root with last node reduce heap size by one and heapify

     */

     public static void Build_Heap(int arr[],int n){

        //Parent of i=(i-1)/2
        //Parent of (n-1)=((n-1)-1)/2 =(n-2)/2
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapify(arr,n,i);
        }
     }
     public static void maxHeapify(int arr[],int n,int i){
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<n&& arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&& arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            // swap(arr[largest],arr[i])
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, n, largest);
        }
     }

     public static void HeapSort(int arr[],int n){
        Build_Heap(arr,n);
        for(int i=n-1;i>=1;i--){
            //Swap(arr[0],arr[i])
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeapify(arr,i,0);
        }
     }
}
