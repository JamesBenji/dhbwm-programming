import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1; // 1–100
        int guess = 0;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (guess != secretNumber) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
            }
        }

        scanner.close();
    }
}
