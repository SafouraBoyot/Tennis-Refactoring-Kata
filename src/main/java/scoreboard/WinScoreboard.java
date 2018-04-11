package scoreboard;

import player.Player;

public class WinScoreboard implements Scoreboard {

    private final Player player;

    public WinScoreboard(Player player) {
        this.player = player;
    }

    public String showScore() {
        return "Win for " + player.getPlayerName();
    }
}
