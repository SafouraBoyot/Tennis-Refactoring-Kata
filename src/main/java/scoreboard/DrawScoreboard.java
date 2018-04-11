package scoreboard;

import player.Player;
import score.Score;

public class DrawScoreboard implements Scoreboard {

    private final Player player;

    public DrawScoreboard(Player player) {
        this.player = player;
    }

    public String showScore() {
        int playerScore = player.getPlayerScore();

        if (Score.isForty(playerScore) || Score.isGame(playerScore)) {
            return Score.DEUCE.scoreText();
        }

        return Score.TextFor(playerScore) + "-All";
    }
}
