public class Main {
    public static void main(String[] args) {
        highScorePosition henriqueScore;

        henriqueScore = new highScorePosition("Henrique",1500);
        System.out.println( henriqueScore.getPlayerName() + " managed to get into position " + henriqueScore.calculateHighScorePosition(henriqueScore.getPlayerScore()));

        highScorePosition franciscoScore;

        franciscoScore = new highScorePosition("Francisco",1005);
        System.out.println( franciscoScore.getPlayerName() + " managed to get into position " + franciscoScore.calculateHighScorePosition(franciscoScore.getPlayerScore()));

        highScorePosition simoneScore;

        simoneScore = new highScorePosition("Simone",505);
        System.out.println( simoneScore.getPlayerName() + " managed to get into position " + simoneScore.calculateHighScorePosition(simoneScore.getPlayerScore()));

        highScorePosition joaoScore;

        joaoScore = new highScorePosition("João",100);
        System.out.println( joaoScore.getPlayerName() + " managed to get into position " + joaoScore.calculateHighScorePosition(joaoScore.getPlayerScore()));

        highScorePosition mariaScore;

        mariaScore = new highScorePosition("Maria",90);
        System.out.println( mariaScore.getPlayerName() + " managed to get into position " + mariaScore.calculateHighScorePosition(mariaScore.getPlayerScore()));

    }


}