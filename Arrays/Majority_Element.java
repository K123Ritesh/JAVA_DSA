package Arrays;

public class Majority_Element {
     //Naive Solution
     //Time :-O(n^2)

     public int FindMajority(int  arr[],int n){
          for(int i=0;i<n;i++){
               int count=1;
               for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                         count++;
                    }
               }
               if(count>n/2){
                    return i;
               }
          }
          return -1;
     }

     //Efficient Solution
     //Time :- O(n)
     public int FindMajorityEfficient(int arr[],int n){
          int res=0;
          int count=1;

          //Find a Candinate

          for(int i=0;i<n;i++){
               if(arr[res]==arr[i]){
                    count++;
               }else{
                    count--;
               }

               if(count==0){
                    res=i;
                    count=1;
               }
          }

          //Check if Candinate is acutally a Majority

          count=0;
          for(int i=0;i<n;i++){
               if(arr[res]==arr[i]){
                    count++;
               }
          }

          if(count<=n/2){
               res=-1;
          }
          return res;
     }

     //we can also optimise the code using HashMap but that will take O(n) Extra Auxiliary Space
     public static void main(String[] args) {
          
     }
}
