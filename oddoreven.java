public class oddoreven {
    public static void checkoddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        System.out.println(getIthBit(7, 2));
    }
}
