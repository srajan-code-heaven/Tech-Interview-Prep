class Solution:
    def rob(self, A):
        if len(A) == 1: return A[0]
        dp = (len(A)+2)*[0]
        dp[0]=0
        dp[1] =0
        for i in range(2, len(A)+2):
            dp[i] = max(dp[i-1], A[i-2] + dp[i-2])
        return dp[-1]