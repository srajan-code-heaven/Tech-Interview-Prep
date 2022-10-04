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
        
        ListNode curr=head,prev=null;
        int l=0;
        while(curr!=null)
        {
            prev=curr;
            curr=curr.next;
            l++;
        }
         
        if(l==0)
        {
            return head;
        }
        k= k%l;
        
        if(k==0)
        {
            return head;
        }
        
        // Creating cycle
        prev.next=head;
        
        int breakPoint=l-k-1;
        
        // 1 2 3 4 5 -- 1
        // l= 5
        // k=2
        // breakpoint = 5-2 =3
        
        // newhead =4
        // 1, 2, 3 -- null
        
        // 4 -5 - 1 - 2 -3
        
        curr=head;
        while(breakPoint!=0)
        {
            curr=curr.next;
            breakPoint--;
        }
        
        ListNode newhead=curr.next;
        
        curr.next=null;
        
        return newhead;
    }
}