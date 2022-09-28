class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0)
        {
            return 0;
        }
        int profit=0;
        int mprice=prices[0];
        for(int i=1;i<n;i++)
        {
           mprice=Math.min(prices[i],mprice);
           profit=Math.max(prices[i]-mprice,profit);
        }
        return profit;
    }
}