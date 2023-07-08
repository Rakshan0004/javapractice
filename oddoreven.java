public class oddoreven {
    public static void checkoddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static void main(String args[]) {
        checkoddoreven(10);
        checkoddoreven(45);
    }
}
