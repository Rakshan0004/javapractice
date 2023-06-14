import java.util.Scanner;

public class palindromeQ {

    public static boolean ispalindrome(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int reminder = palindrome % 10;
            reverse = reverse * 10 + reminder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if (ispalindrome(palindrome)) {
            System.out.println("n : " + palindrome + " is palindrome");
        } else {
            System.out.println("n : " + palindrome + " is not palindrome");
        }
        sc.close();
    }
}
