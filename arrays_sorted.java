public class arrays_sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean sort = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                sort = false;
                break;
            }

        }
        if (sort) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
