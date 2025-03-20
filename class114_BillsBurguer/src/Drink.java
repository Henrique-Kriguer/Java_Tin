public class Drink {
    String type;
    String size;
    float price;

    public Drink(String type, String size, float price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        // configuration the price according size;
        if (this.size.equalsIgnoreCase("small")) {
            this.price = 1.50f;
        } else if (this.size.equalsIgnoreCase("medium")) {
            this.price = 2.50f;
        } else if (this.size.equalsIgnoreCase("large")) {
            this.price = 3.50f;
        } else {
            this.price = price; // Default price if size is not recognized
        }
    }
}

