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
    List<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
      inorder(root);
      return slove(0,list.size()-1);
        
    }
    public TreeNode slove(int s,int e)
    {
        if(s>e)
        return null;
        int mid=(s+e)/2;

        TreeNode l=slove(s,mid-1);
        TreeNode r=slove(mid+1,e);

        TreeNode nn= new TreeNode(list.get(mid));
          nn.left=l;
          nn.right=r;
          return nn;



    } 
    public  void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}