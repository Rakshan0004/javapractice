import java.util.*;

public class reversearraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(6);

        // for (int i = list.size() - 1; i >= 0; i--) {
        // System.out.print(list.get(i) + " ");
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            maxi = Math.max(maxi, list.get(i));
        }

        System.out.println(maxi);

    }
}
