public class DeluxeBurguer {

    Hamburguer hamburguer;
    SideItem sideItem;
    Drink drink;
    ExtraToppings extraToppings1;
    ExtraToppings extraToppings2;
    ExtraToppings extraToppings3;
    ExtraToppings extraToppings4;
    ExtraToppings extraToppings5;
    Float price;

    public DeluxeBurguer(Hamburguer hamburguer, SideItem sideItem, Drink drink, ExtraToppings extraToppings1, ExtraToppings extraToppings2, ExtraToppings extraToppings3, ExtraToppings extraToppings4, ExtraToppings extraToppings5, Float price) {
        this.hamburguer = hamburguer;
        this.sideItem = sideItem;
        this.drink = drink;
        this.extraToppings1 = extraToppings1;
        this.extraToppings2 = extraToppings2;
        this.extraToppings3 = extraToppings3;
        this.extraToppings4 = extraToppings4;
        this.extraToppings5 = extraToppings5;
        this.price = price;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void setSideItem(SideItem sideItem) {
        this.sideItem = sideItem;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public ExtraToppings getExtraToppings1() {
        return extraToppings1;
    }

    public void setExtraToppings1(ExtraToppings extraToppings1) {
        this.extraToppings1 = extraToppings1;
    }

    public ExtraToppings getExtraToppings2() {
        return extraToppings2;
    }

    public void setExtraToppings2(ExtraToppings extraToppings2) {
        this.extraToppings2 = extraToppings2;
    }

    public ExtraToppings getExtraToppings3() {
        return extraToppings3;
    }

    public void setExtraToppings3(ExtraToppings extraToppings3) {
        this.extraToppings3 = extraToppings3;
    }

    public ExtraToppings getExtraToppings4() {
        return extraToppings4;
    }

    public void setExtraToppings4(ExtraToppings extraToppings4) {
        this.extraToppings4 = extraToppings4;
    }

    public ExtraToppings getExtraToppings5() {
        return extraToppings5;
    }

    public void setExtraToppings5(ExtraToppings extraToppings5) {
        this.extraToppings5 = extraToppings5;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
