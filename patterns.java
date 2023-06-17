//https://www.youtube.com/watch?v=lsOOs5J8ycw&t=1s
public class patterns {
    public static void main(String[] args) {
        butterfly(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalcolsinrow = row > n ? 2 * n - row - 1 : row;
            for (int col = 1; col <= totalcolsinrow; col++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    static void inverted_half_pyramid(int n) {
        // rows
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
                // for columns
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // to print 2nd half of butterfly pattern
        for (int i = n; i >= 1; i--) {
            // same code as 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
