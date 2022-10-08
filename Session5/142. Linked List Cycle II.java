/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fptr=head;
        ListNode sptr=head;
        boolean hasCycle=false;
        
        // [1]->next[1]
        
        while(fptr!=null && fptr.next!=null)
        {
            sptr=sptr.next;
            fptr=fptr.next.next;
            if(sptr==fptr)
            {
                hasCycle=true;
                break;
            }
        }
        
        if(!hasCycle)
        {
            return null;
        }
        
        sptr=head;
       ListNode prev=sptr;
        
        while(sptr!=fptr)
        {
            prev=sptr;
            sptr=sptr.next;
            fptr=fptr.next;
        }
        prev.next=null;
        return head;
    }
}