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
        for (int i = 1; i < 3; i++) {
            currentPlayerScore = getCurrentPlayerScore(finalScore, i);
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


    private int getCurrentPlayerScore(StringBuilder finalScore, int i) {
        if (i == 1) return playerOne.getPlayerScore();
        finalScore.append("-");
        return playerTwo.getPlayerScore();
    }
}
