package Mathematics;

public class Palindrome_Number {
     public static void main(String args[]){
          int n=1226;
          int rev=0;
          int num=n; //storing it because at the  last the n==0
          while(n!=0){
               rev=rev*10+n%10;
               n=n/10;
          }
          if(rev==num){
               System.out.println("Yes,Palindrome Number");
          }else{
               System.out.println("Not a Palindrome Number");
          }
          //Time complexity: no. of  digits time the loop will run
     }
}
