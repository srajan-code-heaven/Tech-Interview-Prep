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
        ListNode temp=headA;
        int n1=0,n2=0;
        while(temp!=null)
        {
            temp=temp.next;
            n1++;
        }
        temp=headB;
        while(temp!=null)
        {
            temp=temp.next;
            n2++;
        }
        if(n1>n2)
        {
            while(n1!=n2)
            {
                headA=headA.next;
                n1--;
            }
        }
        else if(n2>n1)
        {
            while(n1!=n2)
            {
                headB=headB.next;
                n2--;
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