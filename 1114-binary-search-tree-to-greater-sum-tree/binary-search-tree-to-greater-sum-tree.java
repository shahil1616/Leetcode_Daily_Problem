class Solution {
    public TreeNode bstToGst(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    public int dfs(TreeNode root, int sum) {
        if (root == null) return 0;
        var val = root.val;
        var right = dfs(root.right, sum);
        root.val += sum + right;
        return val + dfs(root.left, root.val) + right;
    }
}