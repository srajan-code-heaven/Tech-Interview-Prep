class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        ans = []
        nums.sort()
        def helper(pos,n,nums,temp):
            if pos>=n:
                ans.append(temp[::])
                return
            temp.append(nums[pos])
            helper(pos+1,n,nums,temp)
            temp.pop(-1)
            while pos<n-1 and nums[pos]==nums[pos+1]:
                pos+=1
            helper(pos+1,n,nums,temp)
        helper(0,n,nums,[])
        return ans
            