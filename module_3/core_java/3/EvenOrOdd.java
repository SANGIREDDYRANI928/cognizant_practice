
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a Number to Check Even Or Odd : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        sc.close();

    }

}
