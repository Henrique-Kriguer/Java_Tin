public class Product {

    private String name;
    private String size;
    private String type;
    private Double price;

    public Product(String name, String size, String type, Double price) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
