public class Main {
    public static void main(String[] args) {

        Boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonnus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5.000 but greater than 1.000 ");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1.000");
        } else {
            System.out.println("got here !");
        }
    }
}