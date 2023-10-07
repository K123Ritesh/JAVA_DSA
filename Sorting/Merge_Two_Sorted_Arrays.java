package Sorting;

import java.util.Arrays;

public class Merge_Two_Sorted_Arrays {

    //Time:- O((m+n) * log(m+n))
    // Auxiliary Space:- O(m+n)
    
    public static void Merge_Naive(int arr1[],int arr2[],int m,int n){
        int final_arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            final_arr[i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            final_arr[m+i]=arr2[i];
        }
        Arrays.sort(final_arr);
        for(int i=0;i<m+n;i++){
            System.out.print(final_arr[i]+" ");
        }
    }

    /*
        Efficient Solution
        O(m+n) Time
     */

     public static void Merge_Efficiently(int arr1[],int arr2[],int m,int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(arr2[j]+" ");
            j++;
        }
     }
}






