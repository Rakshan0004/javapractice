public class maxsubarraysum {
    public static void binary(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) { // to print
                    currSum += numbers[k];

                }
                System.out.println();
                if (maxSum < currSum) {
                    maxSum = currsum;
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        binary(numbers);
    }
}
