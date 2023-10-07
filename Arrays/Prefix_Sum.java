package Arrays;

public class Prefix_Sum {

     // Quesition:-Given a Fixed Array and Multiple Queries to find ranges sum

     // Naive Solution
     // Time :- O(n)

     static int arr[] = { 1, 2, 3, 4, 5, 6 };

     public static int getSum(int l, int r) {
          int res = 0;
          for (int i = l; i <= r; i++) {
               res += arr[i];
          }
          return res;
     }

     /*
        Idea for geTSum in O(1) Time :- 
                   1.Precompute Prefix Sum Array pSum
                   2.getSum(l,r) = pSum[r] (if l==0)
                                 = pSum[r] - pSum[l-1] OtherWise
      */

     // PreProcessing
     static int n = arr.length;
     static int pSum [] = new int[n];

     pSum[0]=0;for(
     int i = 1;i<n;i++)
     {
          pSum[i] = pSum[i - 1] + arr[i];
     }

     public static int getSumEfficiently(int l,int r){
          if(l==0){
               return pSum[r];
          }
          return pSum[r]-pSum[l-1];
     };

     // For weighted Prefixsum pWSum [i]=i*arr[i] + pWSum[i-1]

}
