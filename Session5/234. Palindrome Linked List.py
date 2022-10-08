# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        fptr=head
        sptr=head
        
        while fptr is not None and fptr.next is not None:
            sptr=sptr.next
            fptr=fptr.next.next
            
        
#         // 1 2 3 4 5 6
#         // 1 2 3 4
#         // 1 3 5 null
        
#         // sptr is at next element to middle
        
#         // 1 2 3 2 1
#         // 1 2 3
#         // 1 3 1
        
#         // sptr is at middle
#         // sptr next element to start my reversal
        
        if fptr is not None:
            sptr=sptr.next
        
        curr=sptr
        prev=None
        nextv=None
        
# Reversing
        while curr is not None:
            nextv=curr.next
            curr.next=prev
            prev=curr
            curr=nextv
        p1=head  
        p2=prev
        
        # checking if it is palindrone 1st half and 2nd half
        while p2 is not None:
            if p1.val!=p2.val:
                return False
            p1=p1.next
            p2=p2.next
        
        return True