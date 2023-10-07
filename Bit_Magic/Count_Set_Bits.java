public class Count_Set_Bits {

     /*
      Naive Solution :- 1.Initialise res=0
                        2.Traverse form last bit to MSB and increment res for set bits
                        3.return res 
      */
     public int count(int n){
          // Time:- O(d)
          int res=0;
          while(n>0){
               if(n%2==1){ // we can replace  (n % 2!=0) with (n & 1!=0) 
                    res++;
               }
               n=n/2;
          }
          return res;
     }
     /*
       Brian Kerningam's Algorithm:-
        Idea => Traverse through only set bits
        Time :-O(Set-bits)
      */
     public int efficient1(int n){
          int res=0;
          while(n>0){
               n=n&(n-1); //This Expression should make the last set bit as  0
               res++;
          }
          return res;
     }
     /*
      Lookup Table Solution :- The idea is to set count bits in O(1) time with some preprocessing Involved
      Assumptiom:-we ha ve 32-bit numbers
      => Precompute count for 8-bit numbers(0 to 255)
         tbl[0]=0
         for(int i=1 to 255){
             tbl[i]=tbl[i & (i-1)]+1
         }
      => Now to count set bits in a given Number n
      => How do you count set bits in the 4-segments individually using table[]
     */
     int table[]=new int[256];
     public void initialise(){
          table[0]=0;
          for(int i=1;i<256;i++){
               table[i]=table[i&(i-1)]+1;
          }
     }
     public int Lookup_Table(int n){
          return table[n&255]+table[n>>8 & 255]+table[n>>16 & 255]+table[n>>24];
     }
     public static void main(String[] args) {
          
     }
     
}
