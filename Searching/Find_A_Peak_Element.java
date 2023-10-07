package Searching;

public class Find_A_Peak_Element {
    /* Peak Element :- Not smaller than Neighbour */
    // Naive Solution
    // Time :- O(n)

    public static int getPeak(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        if(arr[0]>=arr[1]){
            return arr[0];
        }
        if(arr[n-1]>=arr[n-2]){
            return arr[n-1];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]&&arr[i]<=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    //Efficient Solution
    //Time:- O(log(n))

    public static int getPeak_Efficiently(int arr[],int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid])){
                return mid;
            }
            //Main Logic
            //Fact:- "Every independent array has a peak element"
            if(mid>0 && arr[mid-1]>=arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    
}
