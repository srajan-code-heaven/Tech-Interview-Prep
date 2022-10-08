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
    public boolean isPalindrome(ListNode head) {
        ListNode fptr=head;
        ListNode sptr=head;
        if(head!=null)
        {
        while(fptr!=null && fptr.next!=null)
        {
            fptr=fptr.next.next;
            sptr=sptr.next;
        }
        }
        else
        {
            return true;
        }
        ListNode curr=new ListNode();
        if(fptr==null)
        {
             curr=sptr;
        }
        else
        {
             curr=sptr.next;
        }
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        ListNode revhead=prev;
        while(head!=null && revhead!=null)
        {
            if(head.val!=revhead.val)
            {
                return false;
            }
            head=head.next;
            revhead=revhead.next;
        }
        return true;
    }
}