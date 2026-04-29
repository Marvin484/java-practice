package week01.day02;

import java.util.Scanner;

public class GradeCalculator {

    public static String gradeFor(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score (0-100):");
        int score = Integer.valueOf(scanner.nextLine());

        System.out.println("Your grade is: " + gradeFor(score));

        scanner.close();
    }
}
