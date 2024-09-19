class rectangle {
    int length;
    int width;

    public int area() {
        return length * width;
    }

    public int parameter() {
        return 2 * (length + width);
    }
}

public class oops_practice_3 {
    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        r1.length = 10;
        r1.width = 10;

        System.out.println(r1.area());
        System.out.println(r1.parameter());

    }
}
