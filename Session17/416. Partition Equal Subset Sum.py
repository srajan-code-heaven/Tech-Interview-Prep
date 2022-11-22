class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        sum=0
        
        for num in nums:
            sum+=num
        
        if sum%2!=0:
            return False
        
        sum=int(sum/2)
        
        
        dp=[False for i in range(sum+1)]
        
        dp[0]=True
        
        for i in range(len(nums)):
            for j in range(sum,-1,-1):
                if j>=nums[i]:
                    dp[j] = dp[j] or dp[j-nums[i]]
        
        return dp[sum]
    
    