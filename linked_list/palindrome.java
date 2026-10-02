package linked_list;

public class palindrome {

  static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static boolean ispalindrome(Node head){
      Node slow=head;
      Node fast=head;
      while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast = fast.next.next;
      }
      //reverse second half
      Node secondhalf=reverse(slow);
      //compare first half with reverse second half
      Node firsthalf=head;
      while(secondhalf!=null){
        if(firsthalf.val!=secondhalf.val){
          return false;
        }
        firsthalf=firsthalf.next;
        secondhalf=secondhalf.next;

      }
      return true;
      
    }
    //function to reverse a lined list
    private static Node reverse(Node head){
      Node prev=null;
      Node curr=head;
      while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      return prev;
    }
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
     public static void main(String[] args) {

        // Create linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.print("Linked List: ");
        printList(head);

        // Check palindrome
        boolean result = ispalindrome(head);

        System.out.println("Is Palindrome: " + result);
    }
}
