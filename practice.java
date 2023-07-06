import java.util.*;

public class practice {
    // to print last digit of factorial of a number
    public static int LastDigitFact(int n) {
        int lastDigit = 1;

        for (int i = 2; i <= n; i++) {
            lastDigit = (lastDigit * i) % 10;
        }

        return lastDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(LastDigitFact(n));
    }
}