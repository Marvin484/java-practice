package week01.day04;

public class ArrayUtils {
    
    public static int max(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static int min(int[] arr) {
        
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int sum(int[] arr) {
        
        int sum = 0;

        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        
        int[] numbers = {3, 7, 2, 9, 5};

        try {
            System.out.println("");
            System.out.println("Max: " + max(numbers));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("");
            System.out.println("Min: " + min(numbers));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");
        System.out.println("Sum: " + sum(numbers));
    }
}
