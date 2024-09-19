import java.util.Scanner;
public class percent_calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter marks of math :-- ");
        int a= sc.nextInt();
        System.out.print("Enter marks of sst :-- ");
        int b= sc.nextInt();
        System.out.print("Enter marks of hindi :-- ");
        int c= sc.nextInt();
        System.out.print("Enter marks of english :-- ");
        int d= sc.nextInt();
        System.out.print("Enter marks of music :-- ");
        int e= sc.nextInt();

        int sum = a+b+c+d+e;
        double percentage= (sum/500.00f) *100;
        System.out.println("your percentage is :-- " + percentage +"%");

        sc.close();

    }
}
