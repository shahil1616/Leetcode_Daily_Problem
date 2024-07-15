/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    List<Integer> l= new  ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {


        
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
       return solve(0,l.size()-1);
        
    }
    public TreeNode solve(int i,int j)
    {
        if(i>j)
        return null;
        int mid=(i+j)/2;
        TreeNode nn= new TreeNode(l.get(mid));
        nn.left=solve(i,mid-1);
        nn.right=solve(mid+1,j);
        return nn;



    }
}