import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            try {
                userGuess = Integer.parseInt(scanner.nextLine());
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    System.out.println("It took you " + attempts + " attempts.");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
