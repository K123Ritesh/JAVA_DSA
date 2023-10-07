package Arrays;

public class Largest_Element {
     // Naive Approach
     public int findMax(int arr[]) {
          int n = arr.length;
          for (int i = 0; i < n; i++) {
               boolean flag = true;
               for (int j = 0; j < n; j++) {
                    if (arr[j] > arr[i]) {
                         flag = false;
                         break;
                    }
               }
               if (flag == true) {
                    return i;
               }
          }
          return -1;
     }

     // Better Approach
     public int find_max_better(int arr[]) {
          // Time:-0(n)
          int n = arr.length;
          int max = Integer.MIN_VALUE;
          int idx = -1;
          for (int i = 0; i < n; i++) {
               if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
               }
          }
          return idx;
     }

     public static void main(String[] args) {

     }
}
