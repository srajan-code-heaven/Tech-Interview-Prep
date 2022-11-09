class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<amount+1;j++)
            {
                if(coins[i]<=j)
                {
                // J= curr amount
                // coins[i] using coin i once
                // 1 + dp(J-coins[i])
                // Min (dp[j], 1 + dp(J-coins[i]))
                    if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                    {
                        dp[j]=Math.min(dp[j],1+dp[j-coins[i]]);
                    }
                }
            }
        }
                               
        return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
    }
}