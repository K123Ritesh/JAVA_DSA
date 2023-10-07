package Arrays;

public class Move_All_zero_To_End {

     // public void move_zero_to_end(int arr[],int n){
     //      for(int i=1;i<n;i++){
     //           if(arr[i-1]==0){
     //                int temp=arr[i-1];
     //                arr[i-1]=temp;
     //                arr[i]=temp;
     //           }
     //      }
     // }

     public void move_zero_to_end(int arr[],int n){
          int count=0;
          for(int i=0;i<n;i++){
               if(arr[i]!=0){
                    //swap(arr[i],arr[count])
                    count++;
               }
          }
     }
     public static void main(String[] args) {
          
     }
}
