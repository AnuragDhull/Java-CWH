import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number  a :-- ");
        int a =sc.nextInt();
        System.out.print("Enter a number b :--  ");
        int b = sc.nextInt();
        
        int c = a+b;
        System.out.println("Sum of two no. is :--" + c);

        // to check wheter user enter a number or not
        System.out.print("--: Enter something :-- ");
        boolean isNumber =sc.hasNextInt();
        System.out.println(isNumber);

        // to take string as input

        System.out.print("Enter a string :-- ");
        String str1 =sc.next();
        System.out.println(str1 );

        sc.close();



    }
}
