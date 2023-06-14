
/* 
import java.util.*;
import java.util.Scanner;

public class primeinrange {
    public static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // True
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primes(100);
    }
}
*/

public class primeinrange {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primes(10);
    }
}
