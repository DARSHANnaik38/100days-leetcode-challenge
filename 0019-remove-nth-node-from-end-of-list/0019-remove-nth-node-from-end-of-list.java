/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) {
            return null;
        }

        // if(head.next = null) {
        //     return null;
        // }


        ListNode dummy = new ListNode(-1);
        dummy.next =  head;

        ListNode firstptr = dummy;
        ListNode secondptr = dummy;

        for(int i = 0 ; i < n ; i++) {
            secondptr = secondptr.next;
        }

        while(secondptr.next != null) {
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }

        firstptr.next = firstptr.next.next;

        return dummy.next;
    }
}