/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        
        ListNode curr=headA;
        while(curr!=null)
        {
            l1++;
            curr=curr.next;
        }
        
        curr=headB;
        while(curr!=null)
        {
            l2++;
            curr=curr.next;
        }
        
        if(l2>l1)
        {
            int headStart=l2-l1;
            while(headStart!=0)
            {
                headB=headB.next;
                headStart--;
            }
        }
        else
        {
            int headStart=l1-l2;
            while(headStart!=0)
            {
                headA=headA.next;
                headStart--;
            }
        }
        
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
    }
}