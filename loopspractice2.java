import java.util.*;

public class loopspractice2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.println("enter any positive number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();
    }

}