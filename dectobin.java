public class dectobin {
    public static void decitobinary(int decNum) {
        int myNumber = decNum;
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) (Math.pow(10, pow)));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println(myNumber + " = " + binNum);
    }

    public static void main(String[] args) {
        decitobinary(15);
    }

}
