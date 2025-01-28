public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Engine is starting");
    }


    protected void runEngine(){
        System.out.println("Car -> Engine is running");
    }

    public void drive() {
        System.out.println("Car -> It´s driving, type is " + getClass()
                .getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;


    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("GasPoweredCar -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}