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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode curr=head;
       int len=0;
       while(curr!=null && len<=k)
       {
           len++;
           curr=curr.next;
       }
        
        if(len<k)
        {
            return head;
        }
         curr=head;
         ListNode next=null;
        ListNode prev=null;
        int count=0;
        while(curr!=null && count!=k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(curr!=null)
        {
            head.next=reverseKGroup(curr,k);
        }
        return prev;
    }
}