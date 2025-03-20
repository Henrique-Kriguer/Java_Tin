public class Main {

    public static void main(String[] args) {
        HamburguerMeal meal = new HamburguerMeal();
        meal.setHamburger(new Hamburger("Cheeseburger", "Medium", "Beef", 5.99));
        meal.setDrink(new Drink("Coke", "Medium", "Soda", 1.99));
        meal.setSideItem(new SideItem("Fries", "Medium", "Potato", 2.99));

        meal.printItemList();
    }
}