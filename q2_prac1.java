import java.util.Scanner;

public class q2_prac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter something :- ");
        boolean isNumber=sc.hasNextInt();
        System.out.println(isNumber);
        sc.close();
    }
}
