import java.util.DoubleSummaryStatistics;

public class Dog extends Animal{

private String earShape;
private String tailShape;

public Dog(){

}

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type,  Double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small": (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move( String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    System.out.println();

    }

    private void bark(){
    System.out.println("Animal type " + getType() + " barks.");
    }

    private void run(){
        System.out.println(" Dog running ");
    }

    private void walk(){
        System.out.println("Dog walking" );
    }

    private void wagTail(){
        System.out.println(" Tail Wagging ");
    }

    @Override
    public String toString() {
        return super.toString() +"Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} ";
    }
    @Override
    public void makeNoise(){
        if ( type == "Wolf"){
            System.out.println("Ow Woooooo!");
        }
        System.out.println("Dogs walk, run and wag their tail.");
    }

}
