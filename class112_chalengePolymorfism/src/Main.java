public class Main {
    public static void main(String[] args) {

       Car car = new Car("2022 red barchetta");
       runRace(car);

       Car ferrary = new GasPoweredCar("2022 red barchetta", 10.5, 8);
         runRace(ferrary);

       Car tesla = new ElectricCar("2022 red tesla model 3", 568, 75);
         runRace(tesla);

       Car ferraryHybrid = new HybridCar("2022 black Ferrary sf90 Stradale", 16.5, 8, 8);
         runRace(ferraryHybrid);
    }

    public static void runRace(Car car){
     car.startEngine();
     car.drive();
    }
}