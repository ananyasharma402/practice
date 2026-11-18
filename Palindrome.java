public class Palindrome {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //  Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare 
        Node first = head;
        Node second = secondHalf;

        while (second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    
    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


