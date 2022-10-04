class Solution:
        
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        return self.helper(head)
    
    def helper(self,head):
        if head is None or head.next is None:
            return head
        temp=self.helper(head.next)
        head.next.next=head
        head.next=None
        return temp

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        
        prev=None
        
        while head.next:
            temp=head.next
            head.next=prev
            prev=head
            head=temp
        head.next=prev
        
        return head
            