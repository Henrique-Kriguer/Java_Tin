//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



/*        Item coke = new Item("drink", "Coke", 1.5);
        //coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item fries = new Item("fries", "French Fries", 2.0);
        fries.setSize("LARGE");
        fries.printItem();

        Item burger = new Item("burger", "Cheeseburger", 5.0);
        burger.setSize("SMALL");
        burger.printItem();

        Item tomatoes = new Item("tomatoes", "Tomatoes", 2.0);
        tomatoes.setSize("LARGE");
        tomatoes.printItem();
    }*/
/*
        Burger burger = new Burger("regular", 50.0);
        //burger.setSize("LARGE");
        burger.addToppings("Salad", "Bacon", "Cheese");
        burger.printItem();

        //Item.printItem("Total Price", burger.getAdjustedPrice());

 */
        MealOrder mealOrder = new MealOrder();
        mealOrder.addToppings("Salad", "Bacon", "Cheese");
        mealOrder.setDrinkSize("LARGE");
        
        mealOrder.printItemizedList();

    }
}