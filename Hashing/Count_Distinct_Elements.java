package Hashing;

import java.util.HashSet;

public class Count_Distinct_Elements {

    //Naive Solution
    //Time:-O(n^2)
    //Auxiliary Space :- O(1)

    public static int Count_Distinct(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }

    //Efficient Solution

    public static int Count_Distinct_Efficiently(int arr[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        /*
           Improved Implementation :-
             HashSet<Integer>set=new HashSet<>(Arrays.asList(arr))
         */
        return set.size();
    }
}
