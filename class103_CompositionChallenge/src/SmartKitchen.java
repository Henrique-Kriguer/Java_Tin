public class SmartKitchen {
    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;

    public SmartKitchen(Refrigerator refrigerator,
                        CoffeeMaker coffeeMaker,
                        DishWasher dishWasher) {
        this.refrigerator = refrigerator;
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
    }

    public void brewMaster() {
        coffeeMaker.brewCoffee();
    }
    public void dishWasher() {
        dishWasher.washDishes();
    }
    public void iceBox() {
        refrigerator.orderFood();
    }
    public void pourMilk() {
        refrigerator.orderFood();
    }
    public void setKitchenState(boolean refrigeratorState, boolean coffeeMakerState, boolean dishWasherState) {
        refrigerator.hasWorkToDo();
        coffeeMaker.hasWorkToDo();
        dishWasher.hasWorkToDo();
    }

    public void doKitchenWork() {
        if (refrigerator.hasWorkToDo()) {
            refrigerator.orderFood();
        }
        if (coffeeMaker.hasWorkToDo()) {
            coffeeMaker.brewCoffee();
        }
        if (dishWasher.hasWorkToDo()) {
            dishWasher.washDishes();
        }
    }
}
