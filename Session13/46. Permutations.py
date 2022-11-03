class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        n=len(nums)
        def helper(nums,n,pos):
            if pos>=n:
                ans.append(nums[::])
                return
            for i in range(pos,n):
                nums[pos],nums[i]=nums[i],nums[pos]
                helper(nums,n,pos+1)
                nums[pos],nums[i]=nums[i],nums[pos]
        helper(nums,n,0)
        return ans