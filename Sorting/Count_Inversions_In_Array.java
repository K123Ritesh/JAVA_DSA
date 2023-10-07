package Sorting;

public class Count_Inversions_In_Array {
    /*
        A pair (arr[i],arr[j]) forms an inversion when i<j and arr[i]>arr[j]
     */
    public static int Count_Inversions_Naive(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }

    /*
         Efficient Solution :- O(nlog(n)) Time and O(n) Auxiliary Space
        * Every Inversion (x,y) where x > y has possibilities:-
          A.Both x and y are in left half
          B.Both x and y are in right half
          C.x is in the left half y is in the right half
     */
     public static int Count_Inversions_Efficient(int arr[],int l,int r){
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=Count_Inversions_Efficient(arr, l, m);
            res+=Count_Inversions_Efficient(arr, m+1, r);
            res+=Count_And_Merge(arr,l,m,r);
        }
        return res;
     }

     public static int Count_And_Merge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-l;
        int left[]=new int [n1];
        int right[]=new int [n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
                res+=n1-i;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
     }

}
