public class Only_Odd_Occuring {

     /*
       Naive Solution :- Count Occurences of every number 
       Time:O(n^2)
      */
     public int findOdd(int arr[],int n){
          for(int i=0;i<n;i++){
               int count=0;
               for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                         count++;
                    }
               }
               if(count %2 !=0){
                    return arr[i];
               }
          }
          return -1;
     }
     /*
       Optimised Approach :- we can optimise the above problem using HashMap(Using Time:-O(n) and Space:-O(n))
       Efficient Approach:- Intresting Properties of ^(xor)
                           1. x ^ 0 = x
                           2. x ^ y = y ^ x
                           3. (x ^ y) ^ z = x ^ (y ^ z)
                           4. x ^ x = 0
                           5. x ^ x ^.....x = x (For Odd Occurences of x)
                           6. x ^ x ^.....x = 0 (For Even Occurences of x)
      */

     public int efficient(int arr[],int n){
          //Time:-0(n)
          //Space:-O(1)
          int res=arr[0];
          for(int i=0;i<n;i++){
               res=res^arr[i];
          }
          return res;
     }
     public static void main(String[] args) {
          
     }
     
}
