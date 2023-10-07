package Arrays;

public class Max_Consecutive_ones_In_BinaryArray {

     //Approach-1
     public int max_Consecutive_ones_Approach_1(int arr[],int n){
          int count =0;
          int max_count=0;
          for(int i=1;i<n;i++){
               if(arr[i-1]==arr[i] && arr[i]==1){
                    count++;
                    if(count>max_count){
                         max_count=count;
                    }
               }
          }
          return max_count;
     }
     
     //Approach-2
     public int max_Consecutive_ones_Approach_2(int arr[],int n){
          int res=0,curr=0;
          for(int i=0;i<n;i++){
               if(arr[i]==0){
                    curr=0;
               }else{
                    curr++;
                    res=Math.max(res,curr);
               }
          }
          return res;
     }
     public static void main(String[] args) {
          
     }
}
