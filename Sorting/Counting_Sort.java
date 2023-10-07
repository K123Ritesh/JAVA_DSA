package Sorting;

public class Counting_Sort {
    /*
         O(n+k) time to sort n elements in range from 0 to k-1
     */

    //Naive Approach
    public static void Count_Sort(int arr[],int n,int k){
        int count[]=new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<count[i];j++){
                arr[index]=i;
                index++;
            }
        }
    }
    /*
        Problem with this Approach --> Cann't be used as a general purpose 
        algorithm for sorting objects with multiple members, like sorting an
        array of students by marks.
     */
    // General Purpose Implementation
    public static void Count_Sort_Better_Approach(int arr[],int n,int k){
        int count[]=new int [k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++){
            count[i]=count[i-1]+count[i];
        }
        int output[]=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    /*
         Important Points:-
            1. Not a comaprison based algorithm
            2. 0(n+k) time
            3. 0(n+k) Auxiliary Space
            4. Stable
            5. Used as a SubRoutine in Radix Sort
            6. Only Useful when k is propotional to n
     */
}
