import java.util.Random;

public class ComputerPlayer extends Player {
    private final Random random;

    public ComputerPlayer() {
        super("Computer");
        this.random = new Random();
    }

    // Method overriding from Player abstract class
    @Override
    public int makeMove(int currentSticks) {

        int maxSticks = currentSticks / 2;

        if (maxSticks > 0) {
            return random.nextInt(maxSticks) + 1;
        } else {
            return 1;
        }

    }
}





