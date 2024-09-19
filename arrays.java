public class arrays {
    public static void main(String[] args) {

        int[] marks = new int[5];

        marks[0] = 1;
        marks[1] = 2;

        System.out.println(marks[0]);

        int[] students = { 1, 2, 3, 4, 5 };
        String[] stu = { "harry", "jaat" };
        float[] top = { 1.0f, 2.0f };
        System.out.println(students.length);

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }

        for (float element : top) {
            System.out.println(element);
        }
    }
}
