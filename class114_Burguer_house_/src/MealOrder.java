public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("Regular", "Coke", "French Fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 50.0); // Base price for burger
        this.drink = new Item("DRINK", drinkType, 1.5); // Base price for drink
        this.side = new Item("SIDE", sideType, 2.0); // Base price for side
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        System.out.println("Meal Order:");
        System.out.println("-".repeat(30));
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        System.out.printf("%-20s%6.2f%n", "TOTAL PRICE", getTotalPrice());
        System.out.println("- ".repeat(15));
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
