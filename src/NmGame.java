public class NmGame {
    private final Player player1;
    private final Player player2;
    private int totalSticks;

    public NmGame(Player player1, Player player2, int totalSticks) {
        this.player1 = player1;
        this.player2 = player2;
        this.totalSticks = totalSticks;
    }
    public void startGame() {
        Player currentPlayer = player1;

        while (totalSticks > 1) {
            System.out.println("Remaining sticks: " + totalSticks);
            int sticksTaken = currentPlayer.makeMove(totalSticks);

            totalSticks -= sticksTaken;
            System.out.println(currentPlayer.name + " took " + sticksTaken + " sticks.");

            if (totalSticks <= 1) {
                System.out.println("Game is over. " + currentPlayer.name + " is the winner!");
                return;
            }

            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

        }
    }
}







