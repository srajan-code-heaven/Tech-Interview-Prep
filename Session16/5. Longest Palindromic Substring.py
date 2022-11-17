class Solution:
    def longestPalindrome(self, s: str) -> str:
        n=len(s)
        # dp=[[False]*n]*n Wrong way to make 2d array
        dp = [[0 for i in range(n)] for j in range(n)]

        maxlen=1
        maxlenstpt=0
        
        for i in range(0,n):
            dp[i][i]=True
            if i<n-1 and s[i]==s[i+1]:
                maxlen=2
                maxlenstpt=i
                dp[i][i+1]=True
                
                
        
        for l in range(3,n+1):
            for st in range(0,n-l+1):
                e=st+l-1
                if s[st]==s[e] and dp[st+1][e-1]==True:
                    dp[st][e]=True
                    if l>maxlen:
                        maxlen=l
                        maxlenstpt=st
                        
        return s[maxlenstpt:maxlenstpt+maxlen]
    