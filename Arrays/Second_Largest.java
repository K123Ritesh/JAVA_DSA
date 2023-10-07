package Arrays;

public class Second_Largest {
     
     public int find_max_better(int arr[]) {
          // Time:-0(n)
          int n = arr.length;
          int max = Integer.MIN_VALUE;
          int idx = -1;
          for (int i = 0; i < n; i++) {
               if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
               }
          }
          return idx;
     }

     /*
      Two Loops are used to solve this problem => Two Travesals
      */
     public int second_Largest(int arr[],int n){
          int max=find_max_better(arr);
          int res=-1;
          for(int i=0;i<n;i++){
               if(arr[i]!=arr[max]){
                    if(res==-1){
                         res=i;
                    }else if(arr[i]>arr[res]){
                         res=i;
                    }
               }
          }
          return res;
     }

     //Better Approach

     public int get_Second_Largest(int arr[],int n){
          int res=-1;
          int largest=0;
          for(int i=1;i<n;i++){
               if(arr[i]>arr[largest]){
                    res=largest;
                    largest=i;
               }
               else if(arr[i]!=arr[largest]){
                    if(res==-1 || arr[i]>arr[res]){
                         res=i;
                    }
               }
          }
          return res;
     }
     public static void main(String[] args) {
          
     }
}
