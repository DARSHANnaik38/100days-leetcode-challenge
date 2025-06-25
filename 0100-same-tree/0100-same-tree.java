class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;            // both null: same
        if (p == null || q == null) return false;           // only one is null: not same
        if (p.val != q.val) return false;                   // values differ: not same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);  // check subtrees
    }
}
