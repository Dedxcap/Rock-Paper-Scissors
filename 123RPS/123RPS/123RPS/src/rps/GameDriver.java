package rps;

import java.util.Scanner;

public class GameDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors!\n\nThe game will keep track of wins and losses for the player." +
                "\nPlay as many rounds as you would like. Type rules to learn how to play.\n");
        Scanner scanner = new Scanner(System.in);
        Logic game = new Logic();
        String playerChoice;

        while (true) {
            System.out.print("Enter rock, paper, scissors, rules, stats, or quit: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("quit")) {
                break;
            } else if (playerChoice.equals("stats")) {
                game.displayStats();
                continue;
            } else if (playerChoice.equals("rules")) {
                game.displayRules();
                continue;
            } else if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, scissors, stats, or quit.");
                continue;
            }

            String computerChoice = game.getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            game.playRound(playerChoice, computerChoice);
        }

        System.out.println("\nGame over!");
        game.displayStats();
        game.whoWins();
        scanner.close();
    }
}
