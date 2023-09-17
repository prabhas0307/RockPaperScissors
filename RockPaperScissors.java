 import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = { "rock", "paper", "scissors" };
        int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        System.out.println("Computer's choice: " + options[computerChoice]);
        System.out.println("Your choice: " + userChoice);

        if (userChoice.equals(options[computerChoice])) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice == 2)
                || (userChoice.equals("paper") && computerChoice == 0)
                || (userChoice.equals("scissors") && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}