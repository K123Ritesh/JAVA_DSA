package Sorting;

public class Bubble_Sort {

    //Time:-0(n^2)
    /*
       Bubble sort never changes the order of equal elements,So Bubble Sort
        is Stable and in-place(No extra Auxiliary Space)
     */
    public static void bubble_Sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i+1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap(arr[j],arr[j+1])
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubble_Sort_Optimised(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i+1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap(arr[j],arr[j+1])
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //make the swap true...
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
}
