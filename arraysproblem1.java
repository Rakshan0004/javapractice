public class arraysproblem1 {
    public static int sevensinarray(int array[][]) {
        int countof7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countof7++;
                }
            }
            System.out.println(countof7);
        }
        return countof7;
    }

    public static void main(String args[]) {
        int array[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };

        sevensinarray(array);
    }
}
