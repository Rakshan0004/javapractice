public class palindromep {

    public static boolean pali(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            int str = n.length();
            if (n.charAt(i) != n.charAt(str - 1 - i)) {// compare with non equal to operator not with equals bc iit
                                                       // always retrurn true if first and last digit r same
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        String n = "racecar";
        System.out.println(pali(n));
    }
}
