public class Power_Of_Two{

     /*
     Naive Solution :- 1.Explicitly Handle 0
                       2.Repeatedly divide by 2
     */
     public boolean isPowerOfTwo(int n){
          if(n==0){
               return false;
          }
          while(n!=1){
               if(n%2!=0){
                    return false;
               }
               n=n/2;
          }
          return true;
     }
     /*
      Efficient Solution:- if  the count of set bits is 1
                              return true
                           else 
                              return false 
      */

      public boolean Efficient(int n){
          if(n==0){
               return false;
          }
          return (n&(n-1))==0; //
      }
     public static void main(String[] args) {
          
     }
}