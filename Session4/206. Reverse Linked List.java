class Solution {
    ListNode ans;
    public ListNode reverseList(ListNode head) {
        return reverseList_rec(head);
       // return ans;
    }


  public ListNode reverseList_rec(ListNode head) {
        if(head==null || head.next==null )
        {
            return head;
        }
        ListNode temp=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}


class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
       ListNode curr=head;
       ListNode next=null;
       while(curr!=null)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
        return prev;
    }
}
