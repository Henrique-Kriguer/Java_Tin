public class highScorePosition {

    private String playerName;
    private int playerScore;
    private int playerPosition;

    public highScorePosition(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000 ){
            return 1;
        } else if (playerScore >=500  ) {
            return 2;
        } else if (playerScore >=100 ) {
            return 3;
        }
            return 4;

    }
}
