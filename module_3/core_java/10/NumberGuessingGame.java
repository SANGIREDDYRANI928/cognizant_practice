import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randomnumber = rd.nextInt(100) + 1;
        int c = 0;
        while (true) {
            c++;
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            if (num == randomnumber) {
                System.out.println("Your Guess is Correct,Good!");
                System.out.println("Random Number:" + randomnumber);
                System.out.println("Guessed Number:" + num);
                System.out.println("You Guessed in " + c + " Attempts");
                break;
            } else if (num > randomnumber) {
                System.out.println("Your Guess is high");
            } else {
                System.out.println("Your Guess is low");
            }
        }
    }
}