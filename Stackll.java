
public class Stackll{

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push operation
    void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed");
    }

    // Pop operation
    void pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped: " + top.data);

        top = top.next;
    }

    // Peek operation
    void peek() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Display stack
    void display() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Stackll stack = new Stackll();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}


