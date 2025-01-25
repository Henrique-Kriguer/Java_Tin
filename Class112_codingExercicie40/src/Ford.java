public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return "Ford -> startEngine()";
    }
    @Override
    public String accelerate() {
        super.accelerate();
        return "Ford -> stopEngine()";
    }

    @Override
    public String brake() {
        super.brake();
        return "Ford -> brake()";
    }
}
