public class Intersectionll {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node getIntersection(Node headA, Node headB) {

        if (headA == null || headB == null) {
            return null;
        }

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String[] args) {

       // Common part
        Node common = new Node(8);
        common.next = new Node(10);

       
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common;

      
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(7);
        headB.next.next.next = common;

        Node result = getIntersection(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}


