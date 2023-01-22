package GameRockPaperScissors;

public class RockPaperScissors {
    private boolean equalMove;

    public static void main(String[] args) {

        Player player1 = new Player("Francisco");
        Player player2 = new Player("Josefina");

        RockPaperScissors game = new RockPaperScissors();
        game.starGame(player1, player2);
    }

    private void starGame(Player player1, Player player2) {
        while (true) {
            player1.move();
            player2.move();
            verifyMoves(player1, player2);

            if (this.equalMove == true) {
                break;
            }
        }
    }

    private void verifyMoves(Player player1, Player player2) {

        if (player1.getMove() == player2.getMove()) {
            System.out.println("Players are tied!");
            return;
        }
        switch (player1.getMove()) {
            case SCISSORS:
                if (player2.getMove() == MovesTypes.PAPER) {
                    System.out.println("Player " + player1.getName() + " won!");
                } else {
                    System.out.println("Player " + player2.getName() + " won!");
                }
                break;
            case PAPER:
                if (player2.getMove() == MovesTypes.ROCK) {
                    System.out.println("Player " + player1.getName() + " won!");
                } else {
                    System.out.println("Player " + player2.getName() + " won!");
                }
                break;
            case ROCK:
                if (player2.getMove() == MovesTypes.SCISSORS) {
                    System.out.println("Player " + player1.getName() + " won!");
                } else {
                    System.out.println("Player " + player2.getName() + " won!");
                }
                break;
        }
        this.equalMove = true;
    }
}