class arrays_2d {
    public static void main(String[] args) {
        int[][] marks = new int[2][3];

        marks[0][0] = 0;
        marks[0][1] = 1;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]);
            }
        }
    }
}