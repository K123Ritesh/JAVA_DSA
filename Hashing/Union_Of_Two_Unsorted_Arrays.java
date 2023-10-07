package Hashing;

import java.util.HashSet;

public class Union_Of_Two_Unsorted_Arrays {
    /*
        Naive Solution :-
          1. Initialise res=0
          2. Create an auxiliary array dist[]
          3. Traverse through arr1[],for every element in arr1[] check if it is 
             present in dist.If no,then 
                      (A) Increment res
                      (B) Append the element to dist[]
          4. Repeat Step 3 for every element of arr2[]   
          
          Time  :- O(m x m + n x (m+n))
     */

     /*
         Efficient Solution :-
           1. Create a Empty HashTable h
           2. Insert all the elements of arr1[] in h --> 0(m)
           3. Insert all the elements of arr2[] in h --> 0(n)
           4. return h.size()
        
           Time:- O(m+n)
           Auxiliary Space:- O(m+n)
      */

      public static int union_Count(int arr1[],int arr2[]){
        HashSet<Integer> h=new HashSet<>();
        for(int x:arr1){
            h.add(x);
        }
        for(int x:arr2){
            h.add(x);
        }
        return h.size();
      }
}
