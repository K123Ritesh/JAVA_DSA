public class Two_Odd_appearing {

     /*Naive Solution :-  Traverse Through the array ,count occurences of every number. If count is odd print the number */

     public void  PrintOdd(int arr[],int n){
          for(int i=0;i<n;i++){
               int count=0;
               for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                         count++;
                    }
               }
               if(count%2 !=0){
                    System.out.println(arr[i]);
               }
          }
     }

     /*
      Idea for Efficient Solution :- 1. Find xor of all the numbers
                                        arr [] = [5,6,10,6,10,6,3,3]
                                        x = 5^6^10^6^10^6^3^3
                                          = 5^6
                                          = 3
                                     2. How do we find the number 5 and 6 from value 3
                                        Hint:- A set bit is 3 means,the bit is having different values in 5 and 6 

      */

     public void  efficient(int arr[],int n){
          int x=0;
          for(int i=1;i<n;i++){
               x=x^arr[i];
          }
          int k=(x & ~(x-1));
          /*
              How does x & ~(x-1) work ?
            =>It finds a number which has only one bit set and the set bit corresponds to last bit of x
           */
          int res1=0,res2=0;
          for(int i=0;i<n;i++){
               if((arr[i] & k) !=0){
                    res1=res1^arr[i];
               }else{
                    res2=res2^arr[i];
               }
          }
          System.out.println(res1 +"and " +res2);
     }
     public static void main(String[] args) {
          
     }
     
}
