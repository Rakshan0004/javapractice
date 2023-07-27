public class alternate {
    public static String mergeAlternately(String word1, String word2) {

        int n1 = word1.length();
        int n2 = word2.length();
        int minLength = Math.min(n1, n2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append remaining characters from the longer string
        if (n1 > n2) {
            sb.append(word1.substring(minLength));
        } else if (n2 > n1) {
            sb.append(word2.substring(minLength));
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}