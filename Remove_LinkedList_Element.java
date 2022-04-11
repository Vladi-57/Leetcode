package Leetcode;

public class Remove_LinkedList_Element {
    public static void main(String args[])
    {
        ListNode node = new ListNode();
        ListNode node2 = new ListNode();
//        node2.val = ;
        System.out.println(removeElements(node, 1));
    }


    /////////////////////////////////////////////////////////////
    public static ListNode removeElements(ListNode head, int val) {
        ListNode remNode = new ListNode();
        ListNode prev = new ListNode();
        remNode.val = head.val;
        prev.val = head.val;

        if(head == null)
        {
            return head; // testing
        }

        while(head != null){
            head.val = val;
            prev.val = head.val;
            head = head.next;

            // prev to hold head prev val
            // curr to hold heac current val;
            // head go to nextval and check if its val
            // if not  give that prev that value
            // current hold  that.
        }

        return head;

    }
    /////////////////////////////////////////////////////////////



}

class ListNode {
     int val;
     ListNode next;

     ListNode() {}

     ListNode(int val) {
          this.val = val;
     }

     ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
     }
}