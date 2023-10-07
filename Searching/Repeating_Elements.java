package Searching;

public class Repeating_Elements {
    /*
      Quesition:- * Array size >=2
                  * Only one element repeats(Any no. of times)
                  * All the elements from 0 to max(arr) are present
                    therefore 0<=max(arr)<=n-2
     */
    /*
     * Solution we want 
                 * O(n) Time
                 * O(1) Auxiliary Space
                 * No modifications to Original Array
     */

     /*
         Super Naive Solution
         Time :- O(n^2)
         Auxiliary Space:-O(1)
         Algorithm:-
                 for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(arr[i]==arr[j]){
                            return arr[i];
                        }
                    }
                 }
      */
     /*
         Naive Solution
         Time :- O(nlog(n))
         Auxiliary Space:-O(1)
         Algorithm:-
                1.Sort the Array
                2.for(int i=0;i<n-1;i++){
                      if(arr[i]==arr[i+1]){
                        return arr[i];
                      }
                  }
      */

      /*
          Efficient Solution
          Time :- O(n)
          Auxiliary Space:-O(n)  
          Algorithm:-
                 1. Create a boolean array named visited of size (n-1)
                 2. for(int i=0;i<n;i++){
                        if(visited[arr[i]]){
                            return arr[i];
                        }
                        visited[arr[i]]=true;
                    }
       */

       /*
           More Efficient Approach 
           Time :-O(n)
           Auxiliary Space:-O(1)
           We first find the solution in this case for modified problem...
           Modifications:-
                     * All elements from 1 to max(arr) are present
                     * 1 <= max(arr) <= n-1
           Approach :- The first element of the cycle will always be the repeating element
        */
    public static int findRepeating_Modified(int arr[],int n){
        int slow=arr[0],fast=arr[0];

        //First Phase
        /*
            Working of First Phase:- 
                                   1. Fast will enter the cycle first(Or at the same time)
                                   2. In every iteration distance increases by one
         */
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        //Second Phase
        /*
            Working of Second Phase:- 
                 Before first meeting :
                               fast distance=2*(Slow-distance)
                               m+x+c*i = 2*(m+x+c*j)
                               m+x = c*(i-2*j)
                    (m+x) is a multiple of c
                    (i,j) --> Number of cycle iterations made by fast and slow respectively before they meet
         */
        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

    //Solution for Arrays having element from 0

    public static int findRepeating(int arr[],int n){
        int slow=arr[0]+1,fast=arr[0]+1;

        //First Phase
        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        }while(slow!=fast);

        //Second Phase
        slow=arr[0]+1;
        while(slow!=fast){
            slow=arr[slow]+1;
            fast=arr[fast]+1;
        }
        return slow-1;
    }

}
