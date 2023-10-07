package Arrays;

public class Equilibrium_Point {

     //Naive Approach
     public int Sum(int i,int j,int arr[]){
          int fsum=0;
          for(int k=i;k<=j;k++){
               fsum+=arr[k];
          }
          return fsum ;
     }

     public boolean Eqb_Point(int arr[]){
          int n=arr.length;
          for(int i=0;i<n-1;i++){
               if(Sum(0, i, arr)==Sum(i+1, n-1, arr)){
                    return true;
               }
          }
          return false;
     }

     /*
       Basic Idea for Efficient Solution -->
             1.Compute Prefix sum
             2.Compute Suffix Sum              
             3.For every element (except corner ones),check if
               ps[i-1] is same as ss[i+1]
      */

     public boolean ePoint(int arr[],int n){
          int rs=0;
          for(int i=0;i<n;i++){
               rs+=arr[i];
          }
          int ls=0;
          for(int i=0;i<n;i++){
               rs-=arr[i];
               if(rs==ls){
                    return true;
               }
               ls+=arr[i];
          }
          return false;
     }
     public static void main(String[] args) {
          
     }
}
