public class method {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = y - x;
        }
        return z;
    }

    static void telljoke() {
        System.out.println("i ivented new world plagarism");
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = logic(a, b);
        System.out.println(c);
        telljoke();
    }
}
