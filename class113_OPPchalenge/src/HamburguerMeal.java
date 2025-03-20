public class HamburguerMeal {
    
    private Hamburger hamburger;
    private Drink drink;
    private SideItem sideItem;

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }
    
    public void printItemList(){
        System.out.println("Hamburger: " + hamburger.getName() + " - " + hamburger.getPrice());
        System.out.println("Drink: " + drink.getName() + " - " + drink.getPrice());
        System.out.println("Side Item: " + sideItem.getName() + " - " + sideItem.getPrice());
    }

    public void setHamburger(Hamburger hamburger) {
    }

    public void setDrink(Drink drink) {
    }

    public void setSideItem(SideItem sideItem) {
    }


    public void getHamburger(Hamburger hamburger) {
    }

    public void getDrink(Drink drink) {
    }

    public void getSideItem(SideItem sideItem) {
    }


}
