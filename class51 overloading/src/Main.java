public class Main {
    public static void main(String[] args) {
        //calculateScore("Henrique", 500);
        int newScore = calculateScore("Henrique",500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore( String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore( int score){
        System.out.println("Umnammed Player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore( ){
        System.out.println("No Player name, no player score.");
        return 0;
    }
}