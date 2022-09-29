class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)
        minprice=float('inf')
        maxprofit=-float('inf')
        for p in prices:
            minprice=min(minprice,p)
            maxprofit=max(maxprofit,p-minprice)
        return maxprofit