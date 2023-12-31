package Sorting;

public class Radix_Sort {
    
    public static void radix_sort(int arr[],int n){
        int mx=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        for(int exp=1;mx/exp>0;exp=exp*10){
            countSort(arr,n,exp);
        }
    }

    public static void countSort(int arr[],int n,int exp){
        int count[]=new int[10];
        int output[]=new int[n];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=0;i<10;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
}
