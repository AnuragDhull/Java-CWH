public class variable_argument {

    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {

        // for taking variable argument we
        // use vararg it take argumnet packed in
        // array

        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(1, 2, 3, 4, 5, 6));

    }
}
