public class Dog extends Animal{

private String earShape;
private String tailShape;

public Dog(){

}

    public Dog(String type, String size, String weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark(){
        System.out.println("Animal type " + getType() + "barks.");
    }

}
