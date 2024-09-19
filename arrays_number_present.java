class arrays_number_present {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5; // check if n present or not
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                found = true;
                break;

            }
        }
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
