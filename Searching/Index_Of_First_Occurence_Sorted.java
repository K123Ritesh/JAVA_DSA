package Searching;

public class Index_Of_First_Occurence_Sorted {
    /*
     * Naive Solution :: Linear Search
     * Time:O(n)
     */
    public static int First_Occurence(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int First_Occurence_Binary_Search_Recursive(int arr[], int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (x > arr[mid]) {
            return First_Occurence_Binary_Search_Recursive(arr, mid + 1, high, x);
        } else if (x < arr[mid]) {
            return First_Occurence_Binary_Search_Recursive(arr, low, mid - 1, x);
        } else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return First_Occurence_Binary_Search_Recursive(arr, low, mid - 1, x);
            }

        }
    }

    public static int First_Occurence_Binary_Search_Iterative(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
