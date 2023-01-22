package GameRockPaperScissors;

public class Player {
    private int playerMove;
    private String name;
    private MovesTypes playerMoveString;

    public Player(String name){
        this.name = name;
        this.playerMove = playerMove;
        this.playerMoveString = playerMoveString;
    }

    public void move() {
        this.playerMove = random(0, 2);
        this.playerMoveString = MovesTypes.values()[playerMove];  //chama o index do enum

        System.out.println(this.name + " played: " + this.playerMoveString);
    }

    public MovesTypes getMove(){
        return this.playerMoveString;
    }

    public String getName() {
        return this.name;
    }
    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}