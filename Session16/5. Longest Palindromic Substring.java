class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        int maxlen=1;
        int startind=0;
        
        for(int i=0;i<n;i++)
        {
            dp[i][i]=1;
            if(i+1<n && s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=1;
                startind=i;
                maxlen=2;
            }
        }
        
        
        for(int l=3;l<=n;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j=i+l-1;
                
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1)
                    {
                        dp[i][j]=1;
                        if(l>maxlen)
                        {
                            maxlen=l;
                            startind=i;
                        }
                    }
            }
        }
        
        return s.substring(startind,startind+maxlen);
    }
}