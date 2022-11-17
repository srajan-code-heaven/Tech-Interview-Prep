class Solution {
    public int change(int amount, int[] coins) {
         int n=coins.length;
        int dp[]=new int[amount+1];
        
        dp[0]=1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<amount+1;j++)
            {
                if(coins[i]<=j)
                {
                        dp[j]=dp[j]+dp[j-coins[i]];
                }
            }
        }
                               
        return dp[amount];
    }
}