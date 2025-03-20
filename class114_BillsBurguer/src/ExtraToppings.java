public class ExtraToppings {
    String type;
    float price;

    public ExtraToppings(String type, float price) {
        this.type = type;
        this.price = price;
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

            // configuration the price according type;
            if (this.type.equalsIgnoreCase("small")) {
                this.price = 1.50f;
            } else if (this.type.equalsIgnoreCase("medium")) {
                this.price = 2.50f;
            } else if (this.type.equalsIgnoreCase("large")) {
                this.price = 3.50f;
            } else {
                this.price = price; // Default price if size is not recognized
            }
        }

}
