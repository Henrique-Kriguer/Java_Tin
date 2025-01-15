public class Player {

    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public void restoreHealth(int extraHealth) {
        this.health += extraHealth;
        if (this.health > 100) {
            this.health = 100;
        }
    }

    public int healthRemaining() {
        return health;
    }

}
