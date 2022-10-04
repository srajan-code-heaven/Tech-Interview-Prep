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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
        {
            return null;
        }
        int length=0;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            prev=curr;
            curr=curr.next;
            length++;
        }
        k=k%length;
        if(k==0)
        {
            return head;
        }
        
        prev.next=head;
        int Roundup=length-k;
        curr=head;
        for(int i=0;i<Roundup;i++)
        {
            curr=curr.next;
        }
        ListNode newhead=curr;
        
        for(int i=0;i<length-1;i++)
        {
            curr=curr.next;
        }
        curr.next=null;
        return newhead;
    }
}