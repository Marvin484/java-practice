package week02.day04;

public class Triangle implements Shape {
    
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public double area() {
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
    
        
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(
            s * (s - side1) * (s - side2) * (s - side3)
        ); 
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    private boolean isValidTriangle() {
        return this.side1 + this.side2 > this.side3 && 
               this.side1 + this.side3 > this.side2 &&
               this.side2 + this.side3 > this.side1;
    }
}
