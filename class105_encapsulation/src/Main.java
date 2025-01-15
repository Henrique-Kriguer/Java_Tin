public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Kriguer";
        player.health = 20;
        player.weapon = "Sword";






        System.out.println("Healt remaining : " + player.healthRemaining());
        player.loseHealth(10);
        System.out.println("Healt remaining : " + player.healthRemaining());
        player.loseHealth(10);
        player.loseHealth(10);
        System.out.println("Healt remaining : " + player.healthRemaining());
    }
}