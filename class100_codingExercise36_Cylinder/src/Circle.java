public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }

    }

    public Double getRadius () {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
