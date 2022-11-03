class Solution:
    
#     def subsets(self, nums: List[int]) -> List[List[int]]:
#         ans=[]
#         n=len(nums)
#         self.helper(0,n,nums,[],ans)
#         return ans
    
#     def helper(self,pos,n,nums,temp,ans):
#         if pos>=n:
#             ans.append(temp[::])
#             return
#         temp.append(nums[pos])
#         self.helper(pos+1,n,nums,temp,ans)
#         temp.pop(-1)
#         self.helper(pos+1,n,nums,temp,ans)


#     def __init__(self):
#         self.ans=[]
    
#     def subsets(self, nums: List[int]) -> List[List[int]]:
#         n=len(nums)
#         self.helper(0,n,nums,[])
#         return self.ans
    
#     def helper(self,pos,n,nums,temp):
#         if pos>=n:
#             self.ans.append(temp[::])
#             return
#         temp.append(nums[pos])
#         self.helper(pos+1,n,nums,temp)
#         temp.pop(-1)
#         self.helper(pos+1,n,nums,temp)
    
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        ans = []
        def helper(pos,n,nums,temp):
            if pos>=n:
                ans.append(temp[::])
                return
            temp.append(nums[pos])
            helper(pos+1,n,nums,temp)
            temp.pop(-1)
            helper(pos+1,n,nums,temp)
        helper(0,n,nums,[])
        return ans
    