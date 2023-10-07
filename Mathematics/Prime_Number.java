package Mathematics;

public class Prime_Number {
     public static void main(String args[]){
          int n=21;
          for(int i=2;i<(int)Math.sqrt(n);i++){
               if(n%i==0){
                    System.out.println("Not Prime Number");
                    return;
               }
          }
          System.out.println("Yes,it is a Prime Number");
     }
}
