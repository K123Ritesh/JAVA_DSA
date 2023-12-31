package Sorting;

import java.util.Arrays;

/*
           //Example-4
// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface to compare 
class MyCmp implements Comparator<Point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}
*/

class Point implements Comparable<Point> {
    int x, y;

    // Costructor intialising x & y
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P) {
        // Comparing two objects by
        // Subtracting the passed object
        // from current object
        return this.x - P.x;
    }
}

public class Arrays_sort_In_Java {
    public static void main(String[] args) {
        // Example-1
        // Our arr contains 8 elements
        int[] arr1 = { 5, 20, 12, 30 };
        char[] arr2 = { 'B', 'B', 'A', 'C', 'A' };

        // Sorting the first array
        Arrays.sort(arr1);

        // Displaying the first array
        System.out.println(Arrays.toString(arr1));

        // Sorting the second array
        Arrays.sort(arr2);

        // Displaying the second array
        System.out.println(Arrays.toString(arr2));

        int[] arr = { 5, 30, 20, 10, 8 };

        // Example-2
        // Sort subarray from index 1 to 3, i.e.,
        // only sort subarray {30, 20, 10} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));

        // Example-3
        // Array of 3 objects
        Point ex_3[] = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7) };

        // Sorting the object containing array
        Arrays.sort(ex_3);
        for (int i = 0; i < ex_3.length; i++)
            System.out.println(
                    ex_3[i].x + " " + ex_3[i].y);

        // Example-4
        /*
         * // Array of 3 objects
         * Point arr[] = {
         * new Point(10, 20),
         * new Point(3, 12),
         * new Point(5, 7) };
         * 
         * // Sorting the object containing the array
         * // by passing the array and object MyCmp
         * Arrays.sort(arr, new MyCmp());
         * 
         * // Displaying the sorted array
         * for(int i = 0; i < arr.length; i++)
         * System.out.println(
         * arr[i].x + " " + arr[i].y);
         */

        // Example -5
        /*
         * Integer[] arr = {5, 20, 10, 12};
         * 
         * // Note that we have Integer here instead of
         * // int[] as Collections.reverseOrder doesn't
         * // work for primitive types.
         * Arrays.sort(arr, Collections.reverseOrder());
         * 
         * System.out.println(Arrays.toString(arr));
         */
        /*
         * Example-6
         * // A sample Java program to sort a subarray
         * // using Arrays.sort().
         * import java.util.*;
         * import java.lang.*;
         * import java.io.*;
         * 
         * // This class implements
         * // Comparator interface to compare
         * class MyCmp implements Comparator<Integer>
         * {
         * // Sorts the Integers
         * public int compare(Integer a, Integer b)
         * {
         * return a%2 - b%2;
         * }
         * }
         * 
         * // Main class
         * class Test
         * {
         * public static void main(String[] args)
         * {
         * // Integer array
         * Integer[] arr = {5, 20, 10, 3, 12};
         * 
         * // Sorting arrays by passing
         * // arr and MyCmp object
         * Arrays.sort(arr, new MyCmp());
         * 
         * // Displaying the sorted array
         * System.out.println(Arrays.toString(arr));
         * }
         * }
         */
    }
}
