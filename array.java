import java.util.Scanner;

public class array {

    public static int LinearSearch(String Food[], String key) {
        for (int i = 0; i < Food.length; i++) {
            // Once Refer to the Notes if you got any doubt !! 😏
            if (Food[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Food[] = { "Dosa", "Biryani", "Bajji", "FriedRice", "Panner Butter Masala", "Masala Dosa",
                "Pav Bhajji" };
        System.out.println("Enter enter the Item which you eat : ");
        String key = sc.nextLine();
        // String key = "Bajji";
        int index = LinearSearch(Food, key);
        if (index == -1) {
            System.out.println("What ever you are asking is not exist");
        } else {
            System.out.println("What ever you asked the string is in the index number : " + index);
        }
    }
}
