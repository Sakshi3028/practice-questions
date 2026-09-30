package linked_list;

public class deletre_kth_node {
   

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find nth node from end
    static Node findNthFromEnd(Node head, int n) {

        Node fast = head;
        Node slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;

        System.out.println("Linked List:");
        printList(head);

        Node result = findNthFromEnd(head, n);

        if (result != null) {
            System.out.println(n + "th node from end = " + result.data);
        } else {
            System.out.println("Invalid value of n");
        }
    }
}