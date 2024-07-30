public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("GT");
        car.setColor("black");
        car.setDoors(2);
        car.setConvertible(true);
        car.describeCar();
        System.out.println("make: "+car.getMake());
        System.out.println("model: "+car.getModel());

        Car car2 = new Car();
        car2.setMake("tesla");
        car2.setModel("X");
        car2.setColor("grey");
        car2.setDoors(4);
        car2.setConvertible(false);
        car2.describeCar();
        System.out.println("make: "+car2.getMake());
        System.out.println("model: "+car2.getModel());
    }
}