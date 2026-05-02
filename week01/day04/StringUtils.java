package week01.day04;

import java.util.Scanner;

public class StringUtils {
    
    public static void demonstrateStringMethods(String text) {
        
        System.out.println("Here are a few characteristics of the text: ");
        System.out.println("Original text: " + text);
        System.out.println("Text length: " + text.length());
        
        if (text.length() > 0) {
            System.out.println("First character of the text: " + text.charAt(0));
        }
        
        if (text.length() >= 4) {
            System.out.println("Substring (0-4): " + text.substring(0, 4));
        }

        System.out.println("Index of a character (-1 if not present in text): " + text.indexOf("a"));
        System.out.println("Text turned to uppercase: " + text.toUpperCase());

        String[] parts = text.split(" ");
        System.out.println("Split text: ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }

    public static boolean isPalindrome(String text) {
        
        text = text.toLowerCase();
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        demonstrateStringMethods("Good morning!");

        System.out.println("");
        System.out.println("Enter a word to check if it is a palindrome: ");
        String word = scanner.nextLine();

        System.out.println("");
        System.out.println(isPalindrome(word));
        System.out.println("");

        scanner.close();

    }
}
