package Arrays;

public class Reverse_Array {

     public void reverse(int arr[],int n){
          //Time:-0(n)
          int low=0;
          int high=n-1;
          while(low<high){
               //swap(arr[low],arr[high])
               int temp=arr[low];
               arr[low]=arr[high];
               arr[high]=temp;
               low++;
               high--;
          }
     }
     public static void main(String[] args) {
          
     }
}
