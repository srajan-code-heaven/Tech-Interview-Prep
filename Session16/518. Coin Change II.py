class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        dp = [0] * (amount + 1)
        dp[0] = 1
        
        for coin in coins:
            for x in range(0, amount + 1):
                if amount>=coin:
                    dp[x] += dp[x - coin]
        return dp[amount]