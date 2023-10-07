package Searching;

public class Search_In_Sorted_Rotated_Array {
    //Naive Solution

    public static int Search(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    //Efficient Approach
    /*
     * In the case of sorted rotated array one half will always be sorted
     * If middle element is greater than the left most element then the 
       left half is sorted otherwise right half is sorted.
     */

     //Time :- O(log(n))
     //Auxiliary Space :- O(1)
     public static int Search_Efficiently(int arr[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            //Left-Half Sorted
            if(arr[low]<=arr[mid]){
                if(x>=arr[low]&&x<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            
            //Right-Half Sorted
            else{
                if(x>arr[mid]&&x<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
     }

}
