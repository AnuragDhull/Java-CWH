public class recursion_prac_2 {
    static void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; i > j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(6);
    }
}
