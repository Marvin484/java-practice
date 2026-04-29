package week01.day03;

public class Methods {
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int max(int a, int b) {
        return (a > b)? a : b;
    }

    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println(add(2, 5));
        System.out.println(subtract(8, 5));
        System.out.println(isEven(28));
        System.out.println(max(25, 40));
        System.out.println(reverseString("possibilities"));
        System.out.println("");
    }
}
