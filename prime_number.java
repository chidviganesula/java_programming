import java.util.Scanner;
import java.lang.Math;

public class Example {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        is_prime(x);
    }

    public static void is_prime(int x) {
        int flag = 0;
        double i;
        double c = Math.pow(x, 0.5);
        for (i = 2; i <= c; i++) {
            if (x % i == 0)
                flag = 1;
        }
        if (flag == 1)
            System.out.println("Not a prime");
        else
            System.out.println("Prime number");
    }
}
