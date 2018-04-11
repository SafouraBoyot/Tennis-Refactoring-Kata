package player;

public class Player implements Comparable<Player> {
    private int playerScore;
    private final String playerName;

    public  Player(String playerName) {
        this.playerScore = 0;
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void incrementScore() {
        playerScore = playerScore + 1;
    }

    public int compareTo(Player o) {
        return this.playerScore - o.getPlayerScore();
    }
}