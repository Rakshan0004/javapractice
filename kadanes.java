public class kadanes {
    private static final int MIN_VALUE = 0;

    public static void main(String args[]) {
        int numbers[] = { -2, -1, 4, -1, 6 };
        maxsubarraysum(numbers);
    }

    public static void maxsubarraysum(int numbers[]) {
        int CurrentSum = 0;
        int MaxSum = MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            CurrentSum = CurrentSum + numbers[i];

            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
            MaxSum = Math.max(CurrentSum, MaxSum);
        }
        System.out.println(MaxSum);
    }
}
