class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums is None:
            return 0

        if len(nums) == 1:
            return nums[0]

        return max(self.rob_simple(nums[:-1]), self.rob_simple(nums[1:]))

    def rob_simple(self, A: List[int]) -> int:
        if len(A) == 1: return A[0]
        dp = (len(A)+2)*[0]
        dp[0]=0
        dp[1] =0
        for i in range(2, len(A)+2):
            dp[i] = max(dp[i-1], A[i-2] + dp[i-2])
        return dp[-1]