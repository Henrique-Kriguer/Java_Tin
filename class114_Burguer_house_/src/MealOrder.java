public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("Regular", "Coke", "French Fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType) {
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger("Deluxe Burger", 50.0); // Base price for deluxe burger
        } else {
            this.burger = new Burger(burgerType, 28.0); // Base price for regular burger
        }
        this.drink = new Item("DRINK", drinkType, 15.45); // Base price for drink
        this.side = new Item("SIDE", sideType, 21.0); // Base price for side
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();// Deluxe burger has no additional costs for toppings,drink and side.

        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        System.out.println("Meal Order:");
        System.out.println("-".repeat(30));
        burger.printItem();
        if(burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(),0.0);
            Item.printItem(side.getName(),0.0);
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        System.out.printf("%-20s%6.2f%n", "TOTAL PRICE", getTotalPrice());
        System.out.println("- ".repeat(15));
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }
    public void addToppings(String extra1, String extra2, String extra3,String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
    public void setSideSize(String size) {
        side.setSize(size);
    }
}
