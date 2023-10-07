package Sorting;

import java.util.Arrays;

public class Meeting_Maximum_Guests {
    // Time :- O(nlog(n))
    public static int max_Guests(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,res=1,curr=1;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
}
