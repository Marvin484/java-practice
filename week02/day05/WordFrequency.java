package week02.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordFrequency {

   
    // Method to demo ArrayList and Set functionality
    public static void arrayListDemo() {

        // New ArrayList to hold words
        ArrayList<String> words = new ArrayList<>();

        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("apple");
        words.add("mango");
        words.add("cherry");
        
        System.out.println("\nOriginal list: " + words);

        // Sorting the words ArrayList
        Collections.sort(words);

        System.out.println("Sorted list: " + words);

        // Searching the ArrayList for a word
        System.out.println("List contains mango? " + words.contains("mango"));
        System.out.println("Index of mango: " + words.indexOf("mango"));

        // Remove duplicates using a set
        Set<String> uniqueWords = new HashSet<>(words);
        words.clear();
        words.addAll(uniqueWords);
        Collections.sort(words);
        
        System.out.println("List without duplicates: " + words + "\n");
    }

    // Method to count the frequency of words
    public static void wordCounter(String sentence) {
        //New HashMap to hold words and their frequency of appearance
        HashMap<String, Integer> frequency = new HashMap<>();
        String[] tokens = sentence.split(" "); // Split the sentence on spaces
        
        // Add the words to the HashMap while keep track of their frequency
        for (String token: tokens) {
            if (frequency.containsKey(token)) {
                frequency.put(token, frequency.get(token) + 1);
            } else {
                frequency.put(token, 1);
            }
        }

        //Print the words and their frequency
        System.out.println("Word frequencies:");
        for (String word: frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word));
        }
        System.out.println();

    }

    public static void main(String[] args) {
        
        arrayListDemo();

        wordCounter("the cat sat on the mat the cat sat");
    }
}
