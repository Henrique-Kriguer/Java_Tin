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

class HybridCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;


    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up!%n", cylinders);
        System.out.printf("Hybrid -> %d kwh battery is on!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kwh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}