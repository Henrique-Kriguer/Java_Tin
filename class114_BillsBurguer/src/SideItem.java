public class SideItem {
    String type;
    Float price;

    public SideItem(String type) {
        this.type = type;
    }

    public SideItem(String type, Float price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setSideItemPrice(float price) {
        // configuration the price according size;
        if (this.type.equalsIgnoreCase("smallFries")) {
            this.price = 2.50f;
        } else if (this.type.equalsIgnoreCase("mediumFries")) {
            this.price = 5.50f;
        } else if (this.type.equalsIgnoreCase("largeFries")) {
            this.price = 7.00f;
        } else {
            this.price = price; // Default price if size is not recognized
        }
    }

}
