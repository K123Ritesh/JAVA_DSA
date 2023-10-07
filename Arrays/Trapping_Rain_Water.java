package Arrays;

public class Trapping_Rain_Water {
    
    //Naive Solution 
    //Time :-O(n^2)

    public int getWater(int arr[],int n){
        int res=0;
        for(int i=1;i<n-1;i++){
            int lmax=arr[i];
            for(int j=0;j<i;j++){
                lmax=Math.max(arr[j],lmax);
            }
            int rmax=arr[i];
            for(int j=i+1;j<n;j++){
                rmax=Math.max(arr[j],rmax);
            }
            res+=(Math.min(lmax,rmax)-arr[i]);
        }
        return res;
    }

    /*
     * Efficient solution 
     * Time:-O(n)
     * Auxiliary Space :- O(n)
     */

     public int getWater_Efficiently(int arr[],int n){
        int res=0;
        int lmax[]=new int [n];
        int rmax[]=new int [n];

        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }

        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        }

        for(int i=1;i<n-1;i++){
            res+=(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
     }
}
