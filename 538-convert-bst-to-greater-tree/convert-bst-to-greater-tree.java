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
    public TreeNode convertBST(TreeNode root) {
       slove(root,0);
       return root;
        
    }
    public int slove(TreeNode root,int sum)
    {
        if(root==null)
        return 0;
        int val=root.val;
        int r=slove(root.right,sum);
        root.val=root.val+sum+r;
        return val+slove(root.left,root.val)+r;
    }
}