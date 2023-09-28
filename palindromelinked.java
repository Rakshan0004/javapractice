import java.util.*;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class palindromelinked {
    Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        Node mid = middle(head);
        Node secondHalf = reverse(mid.next);
        Node curr1 = head;
        Node curr2 = secondHalf;
        while (curr2 != null) {
            if (!curr2.data.equals(curr1.data)) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // You can create a linked list and test the isPalindrome method here.
        // Example:
        Node head = new Node("a");
        head.next = new Node("b");
        head.next.next = new Node("b");
        head.next.next.next = new Node("a");

        palindromelinked palindromelinked = new palindromelinked();
        System.out.println(palindromelinked.isPalindrome(head)); // Should print true
    }
}
