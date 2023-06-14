public class functionsq2 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        if (isEven(101)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
