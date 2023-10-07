package Arrays;

public class Left_Rotate_array_by_one {

     public void Left_Rotate_one(int arr[],int n){
          int temp=arr[0];
          for(int i=1;i<n;i++){
               arr[i-1]=arr[i];
          }
          arr[n-1]=temp;
     }
     
     public static void main(String[] args) {
          
     }
}
