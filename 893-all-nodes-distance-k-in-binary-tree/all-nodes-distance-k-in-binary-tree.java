/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    boolean f= false;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        add(target,k,0);
        ans(root,target,k);
        return list;
    }

    
    public int ans(TreeNode root,TreeNode target,int k)
    {

        if(root==null)
        return -1;

        if(root.val==target.val)
        return 0;
    
       int d=ans(root.left,target,k);
       if(d!=-1)
       {
        if(d+1==k)
        {
            list.add(root.val);
             return -1;
        }
        int x=k-(d+2);
        add(root.right,x,0);
        return d+1;

       }
       d=ans(root.right,target,k);
       if(d!=-1)
       {
        if(d+1==k)
        {
            list.add(root.val);
            return -1;

        }
        int x=k-(d+2);
        add(root.left,x,0);
        return d+1;

       }
        
       
    return -1;
    }
    public  void add(TreeNode root,int k,int i)
    {
        if(root==null)
        return ;
        if(k==i)
        {
            list.add(root.val);
            return;
        }
        add(root.left,k,i+1);
        add(root.right,k,i+1);

    }
}
    
