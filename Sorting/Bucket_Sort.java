package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sort {
    /*
        1. Consider a situation where we have nnumbers uniformly distributed in range
           from 1 to 10^8.  How do we sort efficiently.
        2. Consider another situation when we have floating point numbers uniformly
           distributed in range from 0.0 to 1.0
    */
    /*
        Time Complexity 
          Assuming k is approx equal to n
        Best Case::Data is uniformly distributed 
                   O(n)
        Worst Case::All items go into a single bucket .If we use Insertion Sort 
                    to sort the individual buckets ,then O(n^2).If we use O(nlog(n))
                    to sort the individual buckets ,then O(nlog(n)).
     */

    public static void bucket_Sort(int arr[],int k){
        int n=arr.length;
        int max_val=arr[0];
        // Find Maximum Value......
        for(int i=1;i<n;i++){
            max_val=Math.max(max_val,arr[i]);
        }
        max_val++;
        ArrayList<ArrayList<Integer>>bkt=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<k;i++){
            bkt.add(new ArrayList<Integer>());
        }
        // Fill the buckets......
        for(int i=0;i<n;i++){
            int bi=(k*arr[i])/max_val; // Most Imp Part.....
            bkt.get(bi).add(arr[i]);
        }
        // Sort Buckets...
        for(int i=0;i<k;i++){
            Collections.sort(bkt.get(i));
        }
        // Join the Buckets...
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<bkt.get(i).size();j++){
                arr[index++]=bkt.get(i).get(j);
            }
        }
    }
}
