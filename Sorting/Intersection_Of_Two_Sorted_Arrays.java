package Sorting;

public class Intersection_Of_Two_Sorted_Arrays {

    //Naive Solution
    //Time:-O(m x n)
    public static void Intersection_Naive(int arr1[],int arr2[],int m,int n){
        for(int i=0;i<m;i++){
            if(i>0&&arr1[i]==arr1[i-1]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
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
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
