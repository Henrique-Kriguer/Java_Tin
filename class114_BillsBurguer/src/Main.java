public class Main {
    public static void main(String[] args) {

    MealOrder mealOrder001 = new MealOrder();
        Hamburguer hamburguer001 = new Hamburguer("Cheeseburguer", 18.0f,
           new ExtraToppings("letuce", 1.50f),
           new ExtraToppings("Tomato", 2.50f),
           new ExtraToppings("crisp onions", 3.50f));
         Drink drink001 = new Drink("Coke", "large", 3.50f);
            SideItem sideItem001 = new SideItem("Fries", 2.50f);



       MealOrder order001 = new MealOrder(hamburguer001, drink001, sideItem001);{
            order001.setHamburguer(hamburguer001);
            order001.setDrink(drink001);
            order001.setSideItem(sideItem001);
        };
        System.out.println(order001.printOrder());
    }


}