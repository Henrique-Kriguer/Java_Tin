public class Fish extends Animal{

    private int fins;
    private int gills;

    public Fish(String type,  Double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving");
    }


    private void moveBackFin(){
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
