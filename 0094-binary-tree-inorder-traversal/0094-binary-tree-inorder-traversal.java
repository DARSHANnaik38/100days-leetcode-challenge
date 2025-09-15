/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderhelper(root , result);
        return result;
        

        
    }
        public void inorderhelper(TreeNode Node , List<Integer> result) {
        if(Node == null) {
            return;
        }
        inorderhelper(Node.left , result);
        result.add(Node.val);
        inorderhelper(Node.right , result);
        }
}