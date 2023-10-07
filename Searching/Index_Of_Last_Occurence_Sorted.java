package Searching;

public class Index_Of_Last_Occurence_Sorted {
    /*
     * Naive Solution :: Linear Search
     * Time:O(n)
     */
    public static int Last_Occurence(int arr[], int n, int x) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int Last_Occurence_Binary_Search_Recursive(int arr[], int low, int high, int x, int n) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (x > arr[mid]) {
            return Last_Occurence_Binary_Search_Recursive(arr, mid + 1, high, x, n);
        } else if (x < arr[mid]) {
            return Last_Occurence_Binary_Search_Recursive(arr, low, mid - 1, x, n);
        } else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                return mid;
            } else {
                return Last_Occurence_Binary_Search_Recursive(arr, mid + 1, high, x, n);
            }

        }
    }

    public static int Last_Occurence_Binary_Search_Iterative(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (arr[mid + 1] != arr[mid] || mid == n - 1) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,8,8,8,8,8,8,9,9,10,10,11,11};
        int ans=Last_Occurence_Binary_Search_Recursive(arr, 0, arr.length-1, 20, arr.length);
        System.out.println(ans);
    }

}
