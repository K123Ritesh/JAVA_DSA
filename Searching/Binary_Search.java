package Searching;

public class Binary_Search {

    /*
        Steps:- First compute mid = (low+high) / 2
                Case.1: arr[mid]==x ==> return mid
                Case.2: arr[mid] >x ==> Repeat: high=mid-1
                Case.3: arr[mid] <x ==> Repeat: low=mid+1
     */

     //Time:- O(log(n))
     //Auxiliary Space:- O(1)
    
     public int Binary_Search_iterative(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    //Time:- O(log(n))
     //Auxiliary Space:- O(log(n))[Due to Function call stack]

    public static int Binary_Search_Recursive(int arr[],int low,int high,int x){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid]>x){
            Binary_Search_Recursive(arr, low, mid-1, x);
        }
            
        return Binary_Search_Recursive(arr, mid+1, high, x);
        
    }
}
