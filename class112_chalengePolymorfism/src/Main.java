public class Main {
    public static void main(String[] args) {

       Car car = new Car("2022 red barchetta");
       runRace(car);

       GasPoweredCar car2 = new GasPoweredCar("2022 red barchetta", 10.5, 8);
         runRace(car2);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}