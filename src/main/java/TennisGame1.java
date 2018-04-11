import player.Player;
import scoreboard.*;

public class TennisGame1 implements TennisGame {

    private final Player playerOne;
    private final Player playerTwo;

    public TennisGame1(String player1Name, String player2Name) {
        playerOne = new Player(player1Name);
        playerTwo = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        getCurrentPlayer(playerName).incrementScore();
    }

    public String getScore() {
        ScoreboardFactory scoreboardFactory = new ScoreboardFactory();
        Scoreboard scoreboard = scoreboardFactory.getScoreboard(playerOne, playerTwo);
       return scoreboard.showScore();
    }

    private Player getCurrentPlayer(String name) {
        if (name.equals(playerOne.getPlayerName())) return playerOne;
        return playerTwo;
    }

}
