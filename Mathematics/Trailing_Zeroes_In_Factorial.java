package Mathematics;

public class Trailing_Zeroes_In_Factorial {
     // Basic Approach(Brute Force Approach)
     public static int getTrailingZeroes(int n) {
          int res = 0;
          int fac_n = fac(n);
          while (fac_n % 10 == 0) {
               res++;
               fac_n = fac_n / 10;
          }
          return res;
     }

     public static int fac(int n) {
          if (n < 0) {
               return -1;
          }
          if (n == 0 || n == 1) {
               return 1;
          }
          return n * fac(n - 1);

          // Time complexity : T(n)=T(n-1)+O(1)
          // Aux space : O(n)
     }

     // Optimised Approach
     public static int getTrailingZeroes_Optimised(int n) {
          int res = 0;
          for (int i = 5; i <= n; i = i * 5) {
               res = res + n / i;
          }
          return res;
          //Time: O(logn)
     }

     public static void main(String args[]) {
          int n = 1250;
          int ans = getTrailingZeroes_Optimised(n);
          System.out.println(ans);
     }

}
