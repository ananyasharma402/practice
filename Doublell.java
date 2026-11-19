public class Doublell {
    
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at a given position (1-based)
    void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        if (temp == tail) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete from beginning
    void deleteAtBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete from end
    void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Delete node by value (first occurrence)
    void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteAtBeginning();
            return;
        }

        if (temp == tail) {
            deleteAtEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // Display forward
    void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Display backward
    void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Doublell dll = new Doublell();

        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(40);
        dll.insertAtPosition(30, 3);

        System.out.println("Original List:");
        dll.displayForward();

        System.out.println("Backward List:");
        dll.displayBackward();

        dll.deleteAtBeginning();
        System.out.println("After deleting beginning:");
        dll.displayForward();

        dll.deleteAtEnd();
        System.out.println("After deleting end:");
        dll.displayForward();

        dll.deleteByValue(30);
        System.out.println("After deleting value 30:");
        dll.displayForward();
    }
}


