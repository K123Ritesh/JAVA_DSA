package Arrays;

public class Remove_Duplicates_From_Sorted_Array {
     
     //Naive Approach

     //Time:-O(n)
     //Space:-O(n)
     public int remove_dup(int arr[],int n){
          int temp[]=new int[n];
          temp[0]=arr[0];
          int res=1;
          for(int i=0;i<n;i++){
               if(temp[res-1]!=arr[i]){
                    temp[res]=arr[i];
                    res++;
               }
          }
          for(int i=0;i<res;i++){
               arr[i]=temp[i];
          }
          return res;
     }

     //Better Approach

     //Time:-O(n)
     //Space:-O(1)
     public int  remove_dup_better(int arr[],int n){
          int res=1;
          for(int i=1;i<n;i++){
               if(arr[i]!=arr[res-1]){
                    arr[res]=arr[i];
                    res++;
               }
          }
          return res;
     }
     public static void main(String[] args) {
          
     }
}
