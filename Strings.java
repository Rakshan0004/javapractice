import java.util.*;

public class Strings {
    public static void main(String args[]) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz"); // there is little difference betwwn above initialization of string and this
                                         // str2
        // its not important upto programmable level

        // STRINGS are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.nextLine(); // .nextLine(); function will store whole sentence
        // unlike .next();
        // System.out.println(name);

        // concatenation
        String firstname = "rakshan";
        String lastname = "chintala";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

    }
}
