package Arrays;

public class Left_Rotate_Array_By_d {
     //We may assume d <= No. of Elements in the array

     //Naive Solution 
     //Time :- O(n x d)
     //Auxiliary Space :- O(1)

     public static void leftRotateByOne(int arr[],int n){
          int temp=arr[0];
          for(int i=1;i<n;i++){
               arr[i-1]=arr[i];
          }
          arr[n-1]=temp;
     }
     public static void leftRotateByD(int arr[],int n,int d){
          for(int i=0;i<d;i++){
               leftRotateByOne(arr, n);
          }
     }

     //Better Solution
     //Time :- 0(n)
     //Auxiliary Space :- 0(d)
     public static void BetterWay(int arr[],int n,int d){
          int temp[]=new int[d];
          for(int i=0;i<d;i++){
               temp[i]=arr[i];
          }
          for(int i=d;i<n;i++){
               arr[i-d]=arr[i];
          }
          for(int i=0;i<d;i++){
               arr[n-d+i]=temp[i];
          }
     }

     //Reversal Algorithm
     //Time :- 0(n)
     //Auxiliary Space :- 0(1)
     
     public static void efficientMethod(int arr[],int n,int d){
          reverse(arr, 0, d-1);
          reverse(arr, d,n-1);
          reverse(arr, 0, n-1);
     }
     public static void reverse(int arr[],int low,int high){
          while(low<=high){
               int temp=arr[low];
               arr[low]=arr[high];
               arr[high]=temp;
               low++;
               high--;
          }
     }
}
