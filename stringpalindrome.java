public class stringpalindrome {
    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) { // O(n)
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {

                // not a palindrome
                return true;
            }
        }
        return false;
    }

    public static float getshortestpath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // south
            if (direction == 'S') {
                y--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'E') {
                x++;
            }
        }
        int X2 = x * x; // (x-0)^2
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]) {
        String str = "racecar";
        // System.out.println(palindrome(str));
        String path = "WNEENESENNN";
        System.out.print(getshortestpath(path));
    }
}
