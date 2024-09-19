import java.util.Scanner;

public class loops_prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter ur income :-- ");
        float income = sc.nextFloat();

        if (income >= 2.5 && income < 5.0) {
            System.out.println("ur tax slab  is 5%");
            System.out.println("tax paid by u is  " + (5.0 / 100.0) * income);
        } else if (income >= 5.0 && income < 10.0) {
            System.out.println("ur tax slab  is 20%");
            System.out.println("tax paid by u is  " + (20.0 / 100.0) * income);
        } else if (income >= 10.0) {
            System.out.println("ur tax slab  is 5%");
            System.out.println("tax paid by u is  " + (30.0 / 100.0) * income);
        } else if (income < 2.5) {
            System.out.println("no tax needed");
        }
        sc.close();

    }
}
