package Sorting;

import java.util.Arrays;

class Interval implements Comparable<Interval>{ 
    int s, e;
    Interval(int s, int e){
        this.s = s;
        this.e = e;
    }
    public int compareTo(Interval a){
         return this.s - a.s;
    }
};

public class Merge_Overlapping_Intervals{
     /*
        How to check two intervals overlap ?
        ** If the larger of the start values lies in the other range then 
           it is overlapping interval.
        ** If the smaller of the end values lies in the other range then 
           it is overlapping interval. 
           
        For merging::
           start=Math.min(R1.start,R2.start)
           end= Math.max(R1.end,R2.end)
     */

     /*
         Efficient Solution 
         --> Sort by start time in increasing order(we will do this here....)
                 OR
         --> Sort by end time in decreasing order
      */
    
    static void mergeIntervals(Interval arr[], int n){  
        Arrays.sort(arr);  
        int res = 0;  
        for (int i=1; i<n; i++){  
            if (arr[res].e >=  arr[i].s){   
                arr[res].e = Math.max(arr[res].e, arr[i].e);  
                arr[res].s = Math.min(arr[res].s, arr[i].s);  
            }else { 
                res++; 
                arr[res] = arr[i];  
            }     
        }  
        
        for (int i = 0; i <= res; i++)  
            System.out.print(  "[" + arr[i].s + ", " + arr[i].e + "] ");  
    } 
    public static void main (String[] args){
        Interval arr[] = { new Interval(5,10),new Interval(3,15),new Interval(18,30),
                                        new Interval(2,7) };
        int n = arr.length;
        mergeIntervals(arr, n);
    }
}

