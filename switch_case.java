import java.util.Scanner;

class switch_case {
    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("u are adult");
                break;
            case 21:
                System.out.println("do marriage");
                break;
            case 60:
                System.out.println("retired");
                break;
            default:
                System.out.println("enjoyyy");

        }
        sc.close();

    }
}