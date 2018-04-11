package scoreboard;

import player.Player;

public class ScoreboardFactory {

    public Scoreboard getScoreboard(Player playerOne,Player playerTwo){
        if (isDraw(playerOne, playerTwo)) {
            return new DrawScoreboard(playerOne);
        }
        if (isAdvantageOrWin(playerOne, playerTwo)) {
            Scoreboard advantageScoreboard = getAdvantageScoreboard(playerOne, playerTwo);
            if (advantageScoreboard != null) return advantageScoreboard;
            return getWinScoreboard(playerOne, playerTwo);
        }
       return new RegularScoreboard(playerOne,playerTwo);
    }

    private Scoreboard getWinScoreboard(Player playerOne, Player playerTwo) {
        if (playerOne.compareTo(playerTwo) >= 2) return new WinScoreboard(playerOne);
        return new WinScoreboard(playerTwo);
    }

    private Scoreboard getAdvantageScoreboard(Player playerOne, Player playerTwo) {
        if (playerOne.compareTo(playerTwo) == 1) return new AdvantageScoreboard(playerOne);
        if (playerOne.compareTo(playerTwo) == -1) return new AdvantageScoreboard(playerTwo);
        return null;
    }

    private boolean isAdvantageOrWin(Player playerOne, Player playerTwo) {
        return playerOne.getPlayerScore() >= 4 || playerTwo.getPlayerScore() >= 4;
    }

    private boolean isDraw(Player playerOne, Player playerTwo) {
        return playerOne.getPlayerScore() == playerTwo.getPlayerScore();
    }

}
