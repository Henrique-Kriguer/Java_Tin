public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return "Holden -> startEngine()";
    }
    @Override
    public String accelerate() {
        super.accelerate();
        return "Holden -> stopEngine()";
    }

    @Override
    public String brake() {
        super.brake();
        return "Holden -> brake()";
    }
}
