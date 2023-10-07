package Arrays;

public class Check_Array_Is_Sorted {

     //Non-Decreasing sorted order is sorted....

     //Naive Approach
     // Time:-O(n^2)
     public boolean isSorted(int arr[]){
          for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                         return false;
                    }
               }
          }
          return true;
     }
     // Better Approach
     // Time:-0(n)
     public boolean Cheeck_If_Sorted(int arr[]){
          for(int i=1;i<arr.length;i++){
               if(arr[i-1]>arr[i]){
                    return false;
               }
          }
          return true;
     }
     public static void main(String[] args) {
          System.out.println("No ERROR");
     }
}
