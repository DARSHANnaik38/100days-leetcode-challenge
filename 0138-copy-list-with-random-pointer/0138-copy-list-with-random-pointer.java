/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node , Node> hs = new HashMap<>();
        if(head == null) {
            return null;
        }
        Node current = head;
        while(current != null) {
            hs.put(current , new Node(current.val));
            current = current.next;
        }

        current = head;
        while(current != null) {
            Node copiednode = hs.get(current);

            copiednode.next = hs.get(current.next);

            copiednode.random = hs.get(current.random);

            current = current.next;
        }

        return hs.get(head);

    }
}