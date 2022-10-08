# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fstptr=head
        slptr=head
        
        if head is None:
            return False
        
        while(fstptr is not None and fstptr.next is not None):
            slptr=slptr.next
            fstptr=fstptr.next.next
            if slptr==fstptr:
                return True
        return False