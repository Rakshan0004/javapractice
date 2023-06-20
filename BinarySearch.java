public class BinarySearch {
    // print subarrays
    public static void binary(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) { // to print all subarrays we write this loop
                    System.out.print(numbers[k] + " "); // subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        binary(numbers);
    }
}
