package oops;

import java.util.Scanner;

class Sqaure {
    int side;

    public int area() {
        return side * side;
    }

    public int parameter() {
        return 4 * side;
    }

}

public class oops_prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side :-- ");
        int side = sc.nextInt();

        Sqaure s1 = new Sqaure();
        s1.side = side;
        System.out.println(s1.side);
        System.out.println(s1.area());
        System.out.println(s1.parameter());
    }
}