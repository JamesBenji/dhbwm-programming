import java.util.Scanner;

public class RockPaperScissors { 

    public static void main(String[] args) {
        String[] options = {"rock", "paper", "scissors"};
        
        int programNumber = (int)(Math.random() * 3) + 1;
        String programChoice = "";
        
        if (programNumber == 1) {
            programChoice = "rock";
        } else if (programNumber == 2) {
            programChoice = "paper";
        } else if (programNumber == 3) {
            programChoice = "scissors";
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: (1) Rock, (2) Paper, (3) Scissors");
        int userOption = scanner.nextInt();

        if (userOption < 1 || userOption > 3) {
            System.out.println("Invalid option. Restart and pick from 1, 2, or 3.");
        } else {
            System.out.println("You chose: " + options[userOption - 1]);
            System.out.println("Program chose: " + programChoice);

            if (userOption == programNumber) {
                System.out.println("It's a draw!");
            } 
            else if ((userOption == 1 && programNumber == 3) ||
                     (userOption == 2 && programNumber == 1) ||
                     (userOption == 3 && programNumber == 2)) {
                System.out.println("Success! You Win! :)");
            } 
            
            else {
                System.out.println("Schade :(");
            }
        }
        
        scanner.close();
    }
}