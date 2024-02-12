/*
Andreas Svensson
svefastbygg@gmail.com
2024-02-10
Nm-Game
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Nm Game!\nChoose number of sticks to start with: ");
            int totalSticks = 0;

            // checks if the inputted sticks is more than five and if its integers
            while (totalSticks < 5) {
                if (scanner.hasNextInt()) {
                    totalSticks = scanner.nextInt();
                    if (totalSticks < 5) {
                        System.out.println("Number of sticks must be 5 or more.");
                    }
                } else {
                    System.out.println("Only numbers is valid for this type of game. Try one more time");
                    // clear the invalid input
                    scanner.next();
                }
            }

            int gameType = 0;
            while (gameType != 1 && gameType != 2) {
                System.out.println("Choose game type:\n1. Two player\n2. One player against computer\nType (1 or 2)");
                if (scanner.hasNextInt()) {
                    gameType = scanner.nextInt();
                    if (gameType != 1 && gameType != 2) {
                        System.out.println("Invalid gameType. Please select 1 or 2.");
                    }
                } else {
                    System.out.println("Please enter a valid number (1 or 2).");
                    scanner.next();
                }
            }

            // Creating instance of human player and or computer player depending on gameType of choice
            Player player1 = new HumanPlayer("Player 1");
            Player player2;
            if (gameType == 1) {
                player2 = new HumanPlayer("Player 2");
            } else {
                player2 = new ComputerPlayer();
            }

            // Creating instance of NmGame and passing in the two players objects and the total sticks chosen
            NmGame game = new NmGame(player1, player2, totalSticks);
            game.startGame();

            System.out.println("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Thanks for playing!");
        // Closing the scanner before the program ends
        scanner.close();
    }
}









