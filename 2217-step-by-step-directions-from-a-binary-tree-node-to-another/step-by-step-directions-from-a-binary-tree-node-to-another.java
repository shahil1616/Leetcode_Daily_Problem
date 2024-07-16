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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode nn =lowestCommonAncestor(root,startValue,destValue);
        StringBuilder s= new StringBuilder();
        StringBuilder d= new StringBuilder();

      lcaToStart(nn,startValue,s);lcaToDest(nn,destValue, d);
      StringBuilder ans= new StringBuilder();
      ans.append(s);
      ans.append(d);
      return ans.toString();
        
    }
     public TreeNode lowestCommonAncestor(TreeNode root, int p, int q)  {
        if(root==null)
        return null;
        if(root.val==p|| root.val==q)
        return root;
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null)
        return root;
        if(l==null)
        return r;
        return l;

        

        
    }
    public int  lcaToStart(TreeNode root, int s,StringBuilder str)
    {
        if(root==null)
        return  0;
        if(root.val==s)
        {
            return 1;
        }
        str.append("U");
        int a=lcaToStart(root.left,s,str);
        if(a==1)
        {
            return 1;
        }
        str.deleteCharAt(str.length()-1);

        str.append("U");
        int b=lcaToStart(root.right,s,str);
        if(b==1){
            return 1;
        }
         str.deleteCharAt(str.length()-1);
         return 0;
    }
    public int lcaToDest(TreeNode root,int d,StringBuilder str)
    {

        if(root==null)
        return  0;
        if(root.val==d)
        {
            return 1;
        }
        str.append("L");
        int a=lcaToDest(root.left,d,str);
        if(a==1)
        {
            return 1;
        }
        str.deleteCharAt(str.length()-1);

        str.append("R");
        int b=lcaToDest(root.right,d,str);
        if(b==1){
            return 1;
        }
         str.deleteCharAt(str.length()-1);
         return 0;
    }

}