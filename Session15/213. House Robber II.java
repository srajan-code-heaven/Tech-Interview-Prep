class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        if(n==0)
        {
            return 0;
        }
        // we are passing index
        return Math.max(rob_linear(0,nums,n-1),rob_linear(1,nums,n-1));
    }
    
     public int rob_linear(int start,int nums[],int n) {
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[1]=0;
        
         // case I - Rob 0th house - start =0 end=n-2
         // case II - Do not Rob 0th House - start =1 end=n-1
        for(int i=2;i<n+2;i++)
        {
            dp[i]=Math.max(nums[start+i-2]+dp[i-2], dp[i-1]);
        }
        
        return dp[n+1];
    }
}
