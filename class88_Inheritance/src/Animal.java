public class Animal {
    protected String type;
    private String size;
    private Double weight;

    public Animal(){// este construtor é necessário para que
        // as outras classes que forem "herdar" possam ser configuradas com a palavra "EXTENDS"

    }

    public Animal(String type, String size, Double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println("Animal type " + type + " moves " + speed + ".");
    }
    public void makeNoise(){
        System.out.println("Animal " + type + " make noise.");
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
