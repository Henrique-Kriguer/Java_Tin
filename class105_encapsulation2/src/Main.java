public class Main {
    public static void main(String[] args) {

        EnhancedPlayer Henrique = new EnhancedPlayer("Henrique", 200, "Sword");
        System.out.println("Initial health : " + Henrique.getHealth());

        EnhancedPlayer Joao = new EnhancedPlayer("João");
        System.out.println("Initial health : " + Joao.getHealth());
    }
}