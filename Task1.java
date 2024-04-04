import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int attempts = 0;
        int secretNumber;
        int guess;
        char playAgain;

        do {
            secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            attempts = 0;
            System.out.println("Guess a number between " + lowerBound + " and " + upperBound + ".");
            
            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts!");
                }
            } while (guess != secretNumber);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
