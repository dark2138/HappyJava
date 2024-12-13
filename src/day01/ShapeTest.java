package day01;

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
/*
class Rectangle2 extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle2 extends Shape {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(4,5),
                new Circle(3)
        };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName()
                    + " - Area: " + s.getArea()
                    + ", Perimeter: " + s.getPerimeter());
        }
    }
}
*/