package Sorting;

public class Cycle_Sort {
    /*
        1. A worst case O(n^2) Sorting Algorithm
        2. Does minimum memory writes and can be useful when memory write is costly
        3. In place and not stable
        4. Useful to solve quesitions like find minimum swaps required to sort an array

     */

     public static void Cycle_Sort_Distinct(int arr[],int n){
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            //Swap(item,arr[pos])
            int temp=arr[pos];
            arr[pos]=item;
            item=temp;
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                //Swap(item,arr[pos])
                int temp1=arr[pos];
                arr[pos]=item;
                item=temp1;
            }
        }
     }
}
