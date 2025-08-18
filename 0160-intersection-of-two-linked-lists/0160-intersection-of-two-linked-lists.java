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
        HashSet<ListNode> visitedNodes = new HashSet<>();

        while(headA != null) {
            visitedNodes.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(visitedNodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;

        
    
    }
}