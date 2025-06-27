import java.util.Scanner;

public class TheaterBand {
    public static void main(String[] args) {
        //Variables
        Scanner in = new Scanner(System.in);
        int customer_age = 0;

        //Scanner
        System.out.print("What's your age? ");

        if (in.hasNextInt()) {
            customer_age = in.nextInt();
            in.nextLine();

            if (customer_age >= 21) {
                System.out.println("You get a wrist band!");
            }
        }
    }
}