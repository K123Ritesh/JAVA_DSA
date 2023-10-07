package Mathematics;

public class Factorial_Number {
     public static void main(String args[]){
          int n=3;
          int  fac=1;
          for(int i=n;i>=1;i--){
               fac=fac*i;
          }
          int ans=fac(3);
          System.out.println(ans);
     }
     public static int fac(int n){
          if(n<0){
               return -1;
          }
          if(n==0||n==1){
               return  1;
          }
          return n*fac(n-1);

          // Time complexity : T(n)=T(n-1)+O(1)
          //Aux space : O(n)
     }
}
