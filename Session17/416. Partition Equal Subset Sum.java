class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int s:nums)
        {
            sum+=s;
        }
        
        if(sum%2!=0)
        {
            return false;
        }
        
        sum=sum/2;
        int n=nums.length;
        boolean dp[]=new boolean[sum+1];
        
        dp[0]=true;
        
        for(int i=0;i<n;i++)
        {
            for(int j=sum;j>=nums[i];j--)
            {
                dp[j]=dp[j]||dp[j-nums[i]];
            }
        }
        
        return dp[sum];
        
        
    }
}