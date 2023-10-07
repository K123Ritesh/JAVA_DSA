package Mathematics;

public class GCD_Of_Numbers {
     public static void main(String args[]){
          int n=12;
          int m=24;
          int ans=gcd(m, n);
          System.out.println(ans);
          
     }
     public static int gcd(int a,int b){
          if(b==0){
               return a;
          } 
          return gcd(b,a%b);
     } 
}
