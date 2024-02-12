import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    // Method overriding from Player abstract class
    @Override
    public int makeMove(int currentSticks) {
        Scanner scanner = new Scanner(System.in);
        int move;
        do {
            System.out.println(name + ", How many sticks do you take? (1 to " + (currentSticks / 2) + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: You have to put in a number.");
                scanner.next();
            }
            move = scanner.nextInt();
            if (move < 1 || move > currentSticks / 2) {
                System.out.println("Wrong number of sticks. Choose between 1 and " + (currentSticks / 2) + ".");
            }
        } while (move < 1 || move > currentSticks / 2);
        return move;
    }
}


