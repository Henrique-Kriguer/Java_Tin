public class Hamburguer {
    String type;
    float price;
    ExtraToppings extraToppings1;
    ExtraToppings extraToppings2;
    ExtraToppings extraToppings3;
    ExtraToppings extraToppings4;
    ExtraToppings extraToppings5;

    public Hamburguer(String type, float price, ExtraToppings extraToppings1, ExtraToppings extraToppings2, ExtraToppings extraToppings3) {
        this.type = type;
        this.price = price;
        this.extraToppings1 = extraToppings1;
        this.extraToppings2 = extraToppings2;
        this.extraToppings3 = extraToppings3;
    }

    public Hamburguer(String type, float price, ExtraToppings extraToppings1, ExtraToppings extraToppings2) {
        this.type = type;
        this.price = price;
        this.extraToppings1 = extraToppings1;
        this.extraToppings2 = extraToppings2;
    }

    public Hamburguer(String type, float price, ExtraToppings extraToppings1) {
        this.type = type;
        this.price = price;
        this.extraToppings1 = extraToppings1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
}
