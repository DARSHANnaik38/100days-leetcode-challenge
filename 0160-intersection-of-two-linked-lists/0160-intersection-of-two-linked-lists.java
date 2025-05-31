/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode firstptr =  headA;
        ListNode secondptr =  headB;

        while(firstptr !=  secondptr) 
        {
            if(firstptr == null)
            {
            firstptr = headB;
            }
            else 
            {
            firstptr = firstptr.next;
            }
             if(secondptr == null)
            {
            secondptr = headA;
            }
            else 
            {
            secondptr = secondptr.next;
            }
        }
        return firstptr;
        
    }
}