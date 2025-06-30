class Solution {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        // Left
        if (!isValidBST(root.left)) return false;

        // Current
        if (prev != null && root.val <= prev.val) return false;
        prev = root;

        // Right
        return isValidBST(root.right);
    }
}
