public class Deletenode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteNode(Node head, int num) {

        // Case 1: If list is empty
        if (head == null) {
            return null;
        }

        // Case 2: If first node contains the value
        if (head.data == num) {
            return head.next;
        }

        Node temp = head;

        // Search for the node
        while (temp.next != null) {

            if (temp.next.data == num) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        // Value not found
        return head;
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        display(head);

        head = deleteNode(head, 20);

        System.out.println("After deletion:");
        display(head);
    }
}


