package week02.day04;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
