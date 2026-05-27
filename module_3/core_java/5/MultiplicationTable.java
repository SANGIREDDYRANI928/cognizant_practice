import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a Number to Print its Multiplication Table");
        n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
        sc.close();

    }
}