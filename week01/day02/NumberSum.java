package week01.day02;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add. Enter 0 to quit. ");
        int input = scanner.nextInt();
        int num = 0;

        while (input != 0) {
            num += input;

            System.out.println("Enter a number to add. Enter 0 to quit. ");
            input = scanner.nextInt();

        }
        System.out.println("The sum is: " + num);
        
        scanner.close();
    }
}
