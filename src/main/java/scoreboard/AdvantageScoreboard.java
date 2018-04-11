package scoreboard;

import player.Player;

public class AdvantageScoreboard implements Scoreboard {
    private final Player player;

    public AdvantageScoreboard(Player player) {
        this.player = player;
    }


    public String showScore() {
        return "Advantage " + player.getPlayerName();
    }
}
