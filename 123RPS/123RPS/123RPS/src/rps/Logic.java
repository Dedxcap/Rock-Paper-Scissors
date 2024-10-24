package rps;

import java.util.Random;

public class Logic {
    private int gamesPlayed = 0;
    private int playerWins = 0;
    private int computerWins = 0;
    private int ties = 0;
    private final Random random = new Random();
    private final String[] choices = {"rock", "paper", "scissors"};

    public String getComputerChoice() {
        return choices[random.nextInt(3)];
    }

    public void playRound(String playerChoice, String computerChoice) {
        gamesPlayed++;
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!\n");
            ties++;
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!\n");
            playerWins++;
        } else {
            System.out.println("Computer wins!\n");
            computerWins++;
        }
    }
    public void displayRules(){
        System.out.println("Rules:\n* Player and computer choose Rock, Paper," +
                " or Scissors\n* Rock beats Scissors\n* Paper beats Rock\n* Scissors beats Paper\n");
    }
    public void displayStats() {
        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Games tied: " + ties);
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins + "\n");
    }
    public void whoWins(){
        if (playerWins == computerWins) {
            System.out.println("You Tied!");
        } else if (playerWins > computerWins) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}
