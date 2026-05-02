package week01.day06;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            int number = random.nextInt(100) + 1;
            int numGuess = 0;

            while (true) {
                System.out.print("Guess a number: ");
                int guess = scanner.nextInt();
                numGuess++;

                if (guess < number) {
                    System.out.println("Go higher.");
                } else if (guess > number) {
                    System.out.println("Go lower.");
                } else {
                    System.out.println("You have guessed correctly.");
                    break;
                }
                
            }
            System.out.println("You have guessed the number in " + numGuess + " attempt(s).");

            System.out.print("Would you like to play again? (yes/no)");
            playAgain = scanner.next();

        }

        System.out.println("Thanks for playing.");
        scanner.close();
    }
}
