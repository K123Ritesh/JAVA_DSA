package Hashing;

import java.util.HashSet;

public class Intersection_Of_Two_Unsorted_Arrays {
    //Naive Solution
    //Time:-O(m x n)
    public static void Intersection_Naive(int arr1[],int m,int arr2[],int n){
        for(int i=0;i<m;i++){
            boolean flag =false;
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    flag =true;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr1[i]+" ");
            } 
        }
    }
    //Efficient Solution
    //Time:- O(m+n)
    //Auxiliary Space:- O(n)
    public static void Intersection_Efficient(int arr1[],int m,int arr2[],int n){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }
}
