import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;  // edge case

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);  // start with the root node

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();  // number of nodes at current level

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();  // remove from front
                level.add(node.val);          // add its value

                if (node.left != null) queue.add(node.left);   // add children
                if (node.right != null) queue.add(node.right);
            }

            result.add(level);  // one level done
        }

        return result;
    }
}
