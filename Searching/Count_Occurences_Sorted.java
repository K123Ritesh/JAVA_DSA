package Searching;

public class Count_Occurences_Sorted {

    public static int Count_Occurences(int[] arr,int n,int x){
        int first=Searching.Index_Of_First_Occurence_Sorted.First_Occurence_Binary_Search_Iterative(arr,n,x);
        int last=Searching.Index_Of_Last_Occurence_Sorted.Last_Occurence_Binary_Search_Iterative(arr, n, x);
        if(first==-1){
            return 0;
        }
        return last-first+1;
    }
    public static void main(String[] args) {
        int arr[]={11,11,11,11,11,11,11,12,13,14,15,16,17,18};
        int ans=Count_Occurences(arr, arr.length, 11);
        System.out.println(ans);
    }
}
