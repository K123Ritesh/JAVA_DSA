package Searching;

public class Square_Root {
    //Naive Solution
    //Time O(root x)
    public static int sqRootFloor(int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }

    //Efficient Solution
    //Time: O(log(x))
    public static int sqRootFloor_Efficiently(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq==x){
                return mid;
            }else if(msq>x){
                high=mid-1;
            }else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
