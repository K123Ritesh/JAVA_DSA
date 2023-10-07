package Mathematics;

public class LCM_Of_Numbers {
     public static void main(String args[]){
          int a=4;
          int b=6;
          int ans=lcm(4,6);
          System.out.println(ans);

     }
     
     public static int lcm(int a,int b){
          int res=Math.max(a,b);
          while(true){
               if(res%a==0&&res%b==0){
                    return res;
               }
               res++;
          }
     }
     //Time: O(a*b-max(a,b))
     //can optimise using gcd calculation
     //a*b=gcd(a,b)*lcm(a,b)
}
