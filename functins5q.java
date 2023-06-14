import java.util.Scanner;

public class functins5q {
    public static int sumofdigits(int n) {
        int sumofdigits = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sumofdigits = lastdigit + sumofdigits;
            n = n / 10;
        }
        return sumofdigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("the sum is " + sumofdigits(number));
        sc.close();
    }
}
