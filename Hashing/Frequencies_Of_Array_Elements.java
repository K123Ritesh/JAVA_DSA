package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequencies_Of_Array_Elements {
    // Naive Solution
    // Time:- O(n^2)
    // Auxiliary Space :- O(1)
    public static void Print_Freq_Naive(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            // 1. Check if Seen Before...
            boolean flag = false;
            for (int j = 0; i < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            // 2. If seen Ignore....
            if (flag == true) {
                continue;
            }
            // 3. If Not Seen Before Count Frequency....
            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            System.out.println(arr[i] + " " + freq);
        }
    }

    //Efficient Solution
    //Time:- O(n)
    //Auxiliary Space :- O(n)
    public static void Print_Freq_Efficiently(int arr[],int n){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int x: arr ){
            map.put(x , map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
