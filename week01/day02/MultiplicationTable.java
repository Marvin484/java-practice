package week01.day02;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your multiplicand? ");
        int num = scanner.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
