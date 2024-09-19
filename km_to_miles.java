import java.util.Scanner;
public class km_to_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter km :-");
        int km=sc.nextInt();

        double miles = km*0.62;

        System.out.println(miles);

        sc.close();

    }
}
