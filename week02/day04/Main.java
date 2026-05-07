package week02.day04;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle = new Circle(9);
        shapes.add(circle);

        Shape rectangle = new Rectangle(4, 8);
        shapes.add(rectangle);
        
        Shape triangle = new Triangle(3, 6, 8);
        shapes.add(triangle);

        System.out.println();

        for (Shape shape: shapes) {
            System.out.println(shape.name());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }


    }
}
