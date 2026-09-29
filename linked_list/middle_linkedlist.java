package linked_list;

public class middle_linkedlist {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //print
     public static void printList(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.println(curr.val + "->");
            curr=curr.next;
        }
        System.out.println("null");
     }
     public static void main(String []args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
         head.next.next.next.next=new ListNode(5);
         System.out.println("linked list:");
         printList(head);

   
     ListNode middle=middleNode(head);
     System.out.println("middlenode" + middle.val);
}
  }
