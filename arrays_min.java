public class arrays_min {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 0 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}