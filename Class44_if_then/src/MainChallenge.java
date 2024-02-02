public class MainChallenge {
    public static void main(String[] args) {

        Boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonnus = 100;
        int finalscore = score;

        if (gameOver){
            finalscore += (levelCompleted * bonnus);
            System.out.println("Your final score was: " + finalscore);
        }
//
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonnus = 200;
//        int newFinalscore = newScore;
//        if (gameOver){
//            newFinalscore += (newLevelCompleted * newBonnus);
//            System.out.println("Your final score was: " + newFinalscore);
//        }
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonnus){
        int finalscore = score;

        if (gameOver){
            finalscore += (levelCompleted * bonnus);
            finalscore += 1000;
            System.out.println("Your final score was: " + finalscore);
        }


    }
}