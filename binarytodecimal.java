public class binarytodecimal {
    public static void bintodec(int binNum) {
        int myNumber = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = myNumber + (lastDigit * (int) (Math.pow(1, pow)));

            pow++;
            myNumber = binNum / 10;
        }
        System.out.println("decimal of " + myNumber + " = " + decNum);
    }

    public static void main(String[] args) {
        bintodec(1100011);
    }
}
