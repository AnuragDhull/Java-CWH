public class recursion {

    static int fact1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact1(n - 1);
        }
    }

    static int fact2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact1(5));
        System.out.println(fact2(5));
    }
}
