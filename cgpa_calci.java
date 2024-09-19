import java.util.Scanner;

public class cgpa_calci {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of hindi :-");
        int a=sc.nextInt();
        System.out.println("Enter marks of sst :-");
        int b=sc.nextInt();
        System.out.println("Enter marks of maths :-");
        int c=sc.nextInt();

        int sum = a+b+c;

        double cgpa = ((sum)/30f);
        System.out.println("Your cgpa is :-- " + cgpa);

        sc.close();
    }
}
