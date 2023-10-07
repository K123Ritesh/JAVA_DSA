package Mathematics;

public class Count_Digits{
     public static void main(String args[]){
          int n=1234;
          int count =0;
          while(n!=0){
               count++;
               n=n/10;
          }
          //Time complexity: no.of digit times the loop will run
          System.out.println(count);
     }
}