import java.util.Scanner;

public class loops_prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter math marks :- ");
        int maths = sc.nextInt();
        System.out.print("enter sst marks :- ");
        int sst = sc.nextInt();
        System.out.print("enter hindi marks :- ");
        int hindi = sc.nextInt();

        double percentage = ((sst + hindi + maths) / 300.00) * 100;
        System.out.print("ur percentage is :--" + percentage + "%");
        System.out.println();

        if (percentage > 33) {
            System.out.println("u are pass");

        } else {
            System.out.println("u are fail");
        }
        sc.close();

    }
}
