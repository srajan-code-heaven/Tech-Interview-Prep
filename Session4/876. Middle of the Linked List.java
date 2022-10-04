class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fptr=head,sptr=head;
        while(fptr!=null && fptr.next!=null)
        {
            fptr=fptr.next.next;
            sptr=sptr.next;
        }
        
        return sptr;
    }
}