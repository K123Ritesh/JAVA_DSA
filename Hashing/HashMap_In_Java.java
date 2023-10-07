package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_In_Java {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("David", 90);

        System.out.println("HashMap: " + scores);

        // Get value by key
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Check if a key is present
        boolean containsBob = scores.containsKey("Bob");
        System.out.println("Contains key Bob: " + containsBob);

        // Remove a key-value pair
        Integer removedScore = scores.remove("Charlie");
        System.out.println("Charlie's score removed: " + removedScore);

        // Size of the HashMap
        int size = scores.size();
        System.out.println("Size of HashMap: " + size);

        // Iterate over key-value pairs
        System.out.println("HashMap (using entrySet):");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }

        // Clear the HashMap
        scores.clear();
        System.out.println("HashMap cleared. Is empty: " + scores.isEmpty());
    }
}
