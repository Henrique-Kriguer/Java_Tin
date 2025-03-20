public class Main {
    public static void main(String[] args) {

    MealOrder mealOrder001 = new MealOrder();
    Hamburguer hamburguer001 = new Hamburguer("Cheeseburguer", 18.0f,
            new ExtraToppings("small", 1.50f),
            new ExtraToppings("medium", 2.50f),
            new ExtraToppings("large", 3.50f));
        mealOrder001.printOrder();
    }


}