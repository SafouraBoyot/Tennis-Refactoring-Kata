package score;

public enum Score {

    DEUCE(-1, "Deuce"),
    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty"),
    FORTY(3, "Forty"),
    Game(4, "Game");


    private final int scoreValue;
    private final String scoreText;

    Score(int scoreValue, String ScoreText) {

        this.scoreValue = scoreValue;
        scoreText = ScoreText;
    }

    public int scoreValue() {

        return scoreValue;
    }

    public String scoreText() {

        return scoreText;
    }


    public static boolean isLove(int score) {
        return LOVE.scoreValue == score;

    }

    public static boolean isFifteen(int score) {
        return FIFTEEN.scoreValue == score;
    }

    public static boolean isThirty(int score) {
        return THIRTY.scoreValue == score;
    }

    public static boolean isForty(int score) {
        return FORTY.scoreValue == score;
    }

    public static boolean isGame(int score) {
        return score >= Game.scoreValue;
    }

    public static String TextFor(int playerScore) {
        if (playerScore == Score.LOVE.scoreValue())
            return LOVE.scoreText;

        if (playerScore == Score.FIFTEEN.scoreValue())
            return FIFTEEN.scoreText;

        if (playerScore == Score.THIRTY.scoreValue())
            return THIRTY.scoreText;

        return "";
    }
}
