public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        DishWasher dishWasher = new DishWasher();
        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, coffeeMaker, dishWasher);
        smartKitchen.doKitchenWork();
    }
}