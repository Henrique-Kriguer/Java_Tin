public class MealOrder {
    Hamburguer hamburguer;
    Drink drink;
    SideItem sideItem;

    public MealOrder() {
    }

    public MealOrder(Hamburguer hamburguer, Drink drink, SideItem sideItem) {
        this.hamburguer = hamburguer;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(Hamburguer hamburguer, Drink drink) {
        this.hamburguer = hamburguer;
        this.drink = drink;
    }

    public MealOrder(Hamburguer hamburguer, SideItem sideItem) {
        this.hamburguer = hamburguer;
        this.sideItem = sideItem;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }

    public String printOrder() {
        String order = "Order: ";
        //order += hamburguer.getType() + " ";
        //order += drink.getType() + " ";
        //order += sideItem.getType() + " ";
        order += "Total: " + (hamburguer.getPrice() + drink.getPrice() + sideItem.getPrice());
        return order;
    }
}
