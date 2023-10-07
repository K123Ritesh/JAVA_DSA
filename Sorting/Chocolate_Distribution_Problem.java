package Sorting;

import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    /*
        Quesition:-Among m students the minimum chocolate and the maximum chocolate that a child get the difference should be minimum

     */
    //Time :- O(nlog(n))
    public static int minDiff(int arr[],int n,int m){
        if(m>n){
            return -1;
        }
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=1;i+m-1<n;i++){
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }
        return res;
    }
}
