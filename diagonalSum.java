public class diagonalSum {
    public static int diagonal(int matrix[][]) {
        int sum = 0;
        // for primary diagonal //O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {// secondary diagonal
        // sum += matrix[i][j];
        // }
        // }
        // }
        for (int i = 0; i < matrix.length; i++) {// primary diagnal
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) { // this condition to make inot equal to j
                sum += matrix[i][matrix.length - 1 - i]; // secondary diagonal
            } // O(1)
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(diagonal(matrix));
    }
}