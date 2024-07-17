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
    List<TreeNode> list= new ArrayList<>();
 HashSet<Integer> set= new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       
        for(int a:to_delete)
        set.add(a);
        root=slove(root);
        if(root!=null)
        list.add(root);
        return list;

        
    }
    public TreeNode slove(TreeNode root)
    {
        if(root==null)
        {
            return null;

        }
       root.left= slove(root.left);
       root.right= slove(root.right);
        if(set.contains(root.val))
        {
            if(root.left!=null)
            {
                list.add(root.left);
            }
            if(root.right!=null)
            {
                list.add(root.right);
            }
            return null;
        }
        return root;
        
    }
 
}