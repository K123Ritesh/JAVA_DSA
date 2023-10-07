package Hashing;

import java.util.HashSet;

public class Pair_With_Given_Sum_Unsorted_Array {
    
    /*
        Naive Method :-
          **There are n*(n-1)/2 pairs
          1. Consider all pairs one by one and check for sum
          2. if we find a pair return true else return false

          Time :- O(n^2)
          Auxiliary Space :- O(1)
     */
    public static boolean isPair(int arr[],int n,int sum){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    /*
        Efficient Solution :-
          Note :- First Inserting everything into a hashtable then 
                  traversing through the array doesn't work
        Time:- O(n)
        Auxiliary Space :- O(n)
     */
    public static boolean isPair_Efficiently(int arr[],int n,int sum){
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr){
            if(set.contains(sum-x)){
                return true;
            }else{
                set.add(x);
            }
        }
        return false;
    }
}
