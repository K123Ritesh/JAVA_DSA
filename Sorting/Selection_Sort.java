package Sorting;

public class Selection_Sort {
    /*
        --> 0(n^2) Algorithm 
        -->Does Less memory writes compared to Quick Sort,
           Merge Sort,Insertion Sort etc.. ,But Cycle Sort
           is Optimal in terms of memory sizes.
        -->Basic Idea for Heap Sort
        -->Not Stable(It might Change the order of equal elements)
        -->In-Place(Doesn't require extra memory)
     */

     public static void Selection_Sort_Naive(int arr[],int n){
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            int min_ind=0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            temp[i]=arr[min_ind];
            arr[min_ind]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
     }
     
     public static void Selection_Sort_In_Place(int arr[],int n){
        /*
            Approach :-
               We Say arr[i] is Minimum and if we found smaller than arr[i] in
               right side (Let's say at index j ) then we change our min_ind
               to j after this inner loop we swap arr[i] and arr[min_ind]
                 
         */
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            //Swap(arr[min_ind],arr[i])
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
     }

}
