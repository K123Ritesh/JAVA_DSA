package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_In_Java {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("HashSet elements: " + fruits);

        // Check if an element is present
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("HashSet contains Banana: " + containsBanana);

        // Remove an element
        boolean removed = fruits.remove("Orange");
        System.out.println("Orange removed: " + removed);

        // Size of the HashSet
        int size = fruits.size();
        System.out.println("Size of HashSet: " + size);

        // Iterate over elements
        System.out.print("HashSet elements (using iterator): ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Clear the HashSet
        fruits.clear();
        System.out.println("HashSet cleared. Is empty: " + fruits.isEmpty());
    }
}
