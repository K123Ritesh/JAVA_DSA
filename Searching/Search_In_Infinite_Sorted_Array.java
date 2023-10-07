package Searching;

public class Search_In_Infinite_Sorted_Array {
    
    //Naive Solution
    //Time:-O(position)

    public static int search(int arr[],int x){
        int i=0;
        while(true){
            if(arr[i]==x){
                return i;
            }
            if(arr[i]>x){
                return -1;
            }
            i++;
        }
    }

    //Efficient Solution 
    //Time :- O(log(position))

    public static int search_Efficiently(int arr[],int x){
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x){
            return i;
        }
        return Searching.Binary_Search.Binary_Search_Recursive(arr, i/2 +1, i-1, x); 
    }

    public static void main(String[] args) {
    
    }
}
