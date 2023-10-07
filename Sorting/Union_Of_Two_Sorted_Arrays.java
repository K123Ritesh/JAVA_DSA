package Sorting;

import java.util.Arrays;

public class Union_Of_Two_Sorted_Arrays {
    //Naive Solution
    //Time:- O((m+n) * log(m+n))
    // Auxiliary Space:- O(m+n)
    public static void Union_Naive(int arr1[],int arr2[],int m,int n){
        int final_arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            final_arr[i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            final_arr[m+i]=arr2[i];
        }
        Arrays.sort(final_arr);

        for(int i=0;i<m+n;i++){
            if(i>0&&final_arr[i]!=final_arr[i-1]){
                continue;
            }
            System.out.print(final_arr[i]+" ");
        }
    }

    //Efficient Solution 
    //Time:- O(m+n)
    public static void Intersection_Efficiently(int arr1[],int arr2[],int m,int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0&&arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0&&arr2[j]!=arr2[j-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
