// Abstract class that's representing a player in the game
public abstract class Player {

    // Protected allows access from subclasses
    protected String name;

    // Constructor for creating player with specific name.
    public Player(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses depending on type of logic that class want to have on makeMove
    public abstract int makeMove(int currentSticks);

}
