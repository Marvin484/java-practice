package week02.day04;

public class Rectangle implements Shape {
    
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
