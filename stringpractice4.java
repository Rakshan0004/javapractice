public class stringpractice4 {
    public static String Compression(String str) {

        /*
         * String newStr = "";
         * for (int i = 0; i < str.length(); i++) { // O(n)
         * Integer count = 1;
         * while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
         * count++;
         * i++;
         * }
         * newStr += str.charAt(i);
         * if (count > 1) {
         * newStr += count.toString();
         * }
         * }
         * return newStr;
         * }
         */
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";

        System.out.println(Compression(str));

    }
}
