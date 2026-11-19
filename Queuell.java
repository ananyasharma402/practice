public class Queuell {
   
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue operation
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;

    }

    // Dequeue operation
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Peek operation
    void peek() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + front.data);
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Display queue
    void display() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Queuell q = new Queuell();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        q.peek();

        q.dequeue();

        System.out.println("After Dequeue:");
        q.display();

        System.out.println("Is Empty: " + q.isEmpty());
    }
}


