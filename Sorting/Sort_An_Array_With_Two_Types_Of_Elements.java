package Sorting;

public class Sort_An_Array_With_Two_Types_Of_Elements {
    /*
       Type 1. Segreagte Positive and negative Integers
       Type 2. Segregate Even and odd
       Type 3. Sort a Binary Array
        and many more types.....
     */
    // Naive Approach
    // Time :- 0(n)
    // Auxiliary Space :- 0(n)

    public static void Segreagte_Pos_Neg_Naive(int arr[],int n){
        int temp[]=new int[n];
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]>=0){
                temp[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<n;j++){
            arr[j]=temp[j];
        }
    }
    /*
       Idea:- This Problem is mainly a variation of partition() of quick sort 
              **Hoare or Lomuto Partition can solve this in 0(n) time and O(1) Auxiliary Space
    */

    public static void Segreagte_Pos_Neg_Efficient(int arr[],int n){
        int i=-1,j=n;
        while(true){
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>=0);
            if(i>=j){
                return;
            }
            //Swap(arr[i],arr[j])
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
