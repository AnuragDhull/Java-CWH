package oops.inheritence;

class Circle {
    double radius;

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

public class prac1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Cylinder c2 = new Cylinder();

        c1.radius = 10;
        c2.height = 10;
        c2.radius = 10;

        System.out.println(c2.area());
        System.out.println(c2.volume());

    }
}
