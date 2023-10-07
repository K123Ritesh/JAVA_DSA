package Searching;

public class Two_Pointers_Approach {
    /*
     * Quesition :- Find if there is a pair with sum x in sorted array
     */

     //Naive Solution
     //Time :-O(n^2)
     //Auxiliary Space:-O(1)

     public static boolean isPair(int arr[],int n,int x){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
     }

     /*
      * Idea for Efficient Solution
        Initially we take i=0 and j=n-1 and then we move i and j towards each other 
           if(arr[i]+arr[j]==sum){
             return true;
           }else if(arr[i]+arr[j]>sum){
             j=j-1;
           }else{
             i=i+1;
           }
      */

      public static boolean isPair_Efficiently(int arr[],int n,int x){
        int i=0,j=n-1;
        while(i<j){
           if(arr[i]+arr[j]==x){
             return true;
           }else if(arr[i]+arr[j]>x){
             j=j-1;
           }else{
             i=i+1;
           }
        }
        return false;
      }
}
