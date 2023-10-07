package Arrays;

public class Maximum_Subarray_Sum {

  /*
   * What is Subarray ?
   * Subarray of {1,2,3} are {1},{2}.{3},{1,2},{1,3} and {1,2,3}
   */

  // Naive Solution
  // Time :- O(n^2)
  // Auxiliary space :- O(1)

  public int maxSum(int arr[], int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
      int curr = 0;
      for (int j = i; j < n; j++) {
        curr = curr + arr[j];
        res = Math.max(res, curr);
      }
    }
    return res;
  }

  /*
   * Efficient Solution
   * We traverse from left to right and compute the maximum sum of subarray ending
   * with this element
   * maxEnding[i]=Math.max(maxEnding[i-1]+arr[i],arr[i]);
   */

   //Time :-O(n)
   //Auxiliary Space :-O(1)

  public int maxSum_Efficiently(int arr[], int n) {
    int res = arr[0];
    int maxEnding = arr[0];
    for (int i = 0; i < n; i++) {
      maxEnding = Math.max(maxEnding + arr[i], arr[i]);
      res = Math.max(res, maxEnding);
    }
    return res;
  }
}
