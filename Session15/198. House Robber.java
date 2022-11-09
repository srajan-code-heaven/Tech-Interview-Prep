class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[1]=0;
        
        for(int i=2;i<n+2;i++)
        {
            dp[i]=Math.max(nums[i-2]+dp[i-2], dp[i-1]);
        }
        
        return dp[n+1];
    }
}