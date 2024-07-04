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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans= new ListNode(-1);
        ListNode temp=ans;
        int cur=0;
        int i=0;
        head=head.next;
        while(head!=null)
        {
            if(head.val!=0)
            {
                cur=cur+head.val;
            }
            else
            {
               ListNode temp1 = new ListNode(cur);
               ans.next=temp1;
               ans=ans.next;
               cur=0;
               
            }
            head=head.next;
        }
        return temp.next;
        
    }
}