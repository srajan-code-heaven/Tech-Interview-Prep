class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        n=len(nums)
        dp=[0 for i in range(0,target+1)]
        dp[0]=1
        for i in range(1,target+1):
            for j in range(0,n):
                if nums[j]<=i:
                    dp[i]=dp[i]+dp[i-nums[j]]
        
        return dp[target]
        