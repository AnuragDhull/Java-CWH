package oops.constructors;

class Cylinder {
    int radius;
    int height;

    public Cylinder(int x, int y) {
        height = x;
        radius = y;
    }

    public void setRadius(int i) {
        radius = i;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int j) {
        radius = j;
    }

    public int getHeight() {
        return radius;
    }

}

public class practise {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(10, 10);

        // cyl.setRadius(10);
        // cyl.setHeight(10);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
    }
}
