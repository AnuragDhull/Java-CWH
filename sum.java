import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1 :-" );
        int a =sc.nextInt();
        System.out.println("Enter number 2 :-" );
        int b =sc.nextInt();
        System.out.println("Enter number 3 :-" );
        int c =sc.nextInt();

        int sum=a+b+c;
        System.out.println("Final sum is :- " + sum);
        sc.close();

    }
}