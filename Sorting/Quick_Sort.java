package Sorting;

public class Quick_Sort {
    /*
       --> Divide and Conquer Algorithm
       --> Worst Case Time:- O(n^2)
       --> Despite of the worst case it is considered faster because 
           of the following reasons:-
               a.In Place
               b.Cache Friendly
               c.Average case is O(nlog(n))
               d.Tail Recursive
       --> Partition is key Function(Naive(Stable),Lomuto,Hoare)
     */
     
     //Time:-O(n)
     //Auxiliary Space :-O(n)
     public static void Naive_Partition(int arr[],int l,int h,int p){
        int temp[]=new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp[i-l];
        }
     }

     public static int Lomuto_Partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                //Swap(arr[i],arr[j])
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swap(arr[i+1],arr[h])
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
     }
     
     public static int Hoare_Partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            // swap(arr[i],arr[j])
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
     }

     public static void Quick_Sort_Lomuto_Partition(int arr[],int l,int h){
        if(l<h){
            int p=Lomuto_Partition(arr, l, h);
            Quick_Sort_Lomuto_Partition(arr, l, p-1);
            Quick_Sort_Lomuto_Partition(arr, p+1, h);
        }
     }
     public static void Quick_Sort_Hoare_Partition(int arr[],int l,int h){
        if(l<h){
            int p=Hoare_Partition(arr, l, h);
            Quick_Sort_Lomuto_Partition(arr, l, p);
            Quick_Sort_Lomuto_Partition(arr, p+1, h);
        }
     }
}
