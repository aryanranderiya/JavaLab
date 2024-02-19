interface Shape {
    abstract double getArea();
}

class Rectangle implements Shape {
    public double getArea() {
        double width = 10, length = 10;
        return width * length;
    }
}

class Circle implements Shape {
    public double getArea() {
        double radius = 10;
        return 3.14 * radius * radius;
    }
}

class Triangle implements Shape {

    public double getArea() {
        double base = 10, height = 20;
        return 0.5 * base * height;
    }

}

public class Experiment6_Pr4 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();
        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Triangle: " + t.getArea());

    }
}
