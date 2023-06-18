import java.util.Scanner;

public class Arrays {
    public static int linearsearch(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String menu[] = { "dosa", "upma", "vada", "samosa", "idly" };
        System.out.println("Enter the menu item : ");
        String item = sc.nextLine();
        int index = linearsearch(menu, item);
        if (index == -1) {
            System.out.print("not found");
        } else {
            System.out.println("item is at the indeax : " + index);
        }
        sc.close();
    }

}
