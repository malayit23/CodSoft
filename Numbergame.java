import java.util.*;
import java.util.Random;

public class Numbergame {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int tryCount = 0;
        int i = 0;
        Scanner scn = new Scanner(System.in);
        do {
            while (true) {
                System.out.println("Enter your guess (1-100): ");
                tryCount++;
                int myguess = scn.nextInt();
                if (myguess == n) {
                    System.out.println("Correct!!! You Win!");
                    System.out.println("You guess the number in " + tryCount + " attempts");
                    break;

                } else if (myguess > n) {
                    System.out.println("Not Correct!!! The number you guess is too high!");
                } else {
                    System.out.println("Not Correct!!! The number you guess is too low!");
                }
            }
            System.out.println("Do you want to continue? If yes then press 0 or else to exit press 1");
            i = scn.nextInt();
        } while (i <= 0);
    }

}
