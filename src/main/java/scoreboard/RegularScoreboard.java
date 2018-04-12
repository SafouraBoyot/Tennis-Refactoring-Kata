package scoreboard;

import player.Player;
import score.Score;

public class RegularScoreboard implements Scoreboard {
    private final Player playerOne;
    private final Player playerTwo;

    public RegularScoreboard(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String showScore() {
        int currentPlayerScore;
        StringBuilder finalScore = new StringBuilder();
        for (int player = 1; player <= 2; player++) {
            currentPlayerScore = getCurrentPlayerScore(finalScore, player);
            if (Score.isLove(currentPlayerScore))
                finalScore.append(Score.LOVE.scoreText());
            if (Score.isFifteen(currentPlayerScore))
                finalScore.append(Score.FIFTEEN.scoreText());
            if (Score.isThirty(currentPlayerScore))
                finalScore.append(Score.THIRTY.scoreText());
            if (Score.isForty(currentPlayerScore))
                finalScore.append(Score.FORTY.scoreText());
        }
        return String.valueOf(finalScore);
    }


    private int getCurrentPlayerScore(StringBuilder finalScore, int player) {
        if (player == 1) return playerOne.getPlayerScore();
        finalScore.append("-");
        return playerTwo.getPlayerScore();
    }
}
