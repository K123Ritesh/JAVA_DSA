public class Check_Kth_bit_is_set {

     /*
      * How to check last bit ? => if(n & 1 !=0){
                                       Print("Yes")
                                    }else {
                                       Print("No")
                                    }
      * How to check the Kth bit? => We mainly need to do bitwise AND with number
      * with only Kth set bit
      */
     public void isSet(int n, int k) {
          int x = 1;
          for (int i = 0; i < k - 1; i++) {
               x = x * 2;
               if ((n & x) != 0) {
                    System.out.println("YES");
               } else {
                    System.out.println("NO");
               }
          }
     }

     /*
      * Efficient Solution 1:- Find x=n/Pow(2,k-1) and check for (n & 1) if it is not
      * equal to zero Print("Yes") else Print("NO")
      */
     public void efficient1(int n,int k){
          //Pow(2,k-1)
          int x=(1<<(k-1));
          if((n&x)!=0){
               System.out.println("YES");
          }else{
               System.out.println("NO");
          }

     }

      /*
      * Efficient Solution 2:- Find x=Pow(2,k-1) and check for (n & x) if it is not
      * equal to zero Print("Yes") else Print("NO")
      */
     public void efficient2(int n,int k){
          //To find n/pow(2,k-1)
          int x =n>>(k-1);
          if((n&1)!=0){
               System.out.println("YES");
          }else{
               System.out.println("NO");
          }
     }
     public static void main(String args[]) {

     }

}
