import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for rock 1 for paper 2 for scissor");
        int user = sc.nextInt();

        Random rm = new Random();
        int computer = rm.nextInt(3);

        if (user == computer) {
            System.out.println("draw");
        } else if (user == 0 && computer == 1 || user == 1 && computer == 0
                || user == 2 && computer == 1)
            System.out.println("u win");
        else {
            System.out.println("u lose");
        }
        sc.close();

    }
}
