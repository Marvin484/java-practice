package week01.day02;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your grade?");
        System.out.println("Enter your grade (0-100):");
        int grade = scanner.nextInt();
        
        if (grade >= 90) {
            System.out.println("Your grade is: A");
        }
        else if (grade >= 80) {
            System.out.println("Your grade is: B");
        }
        else if (grade >= 70) {
            System.out.println("Your grade is: C");
        }
        else {
            System.out.println("Your grade is: F");
        }
        
        scanner.close();
    }
}
