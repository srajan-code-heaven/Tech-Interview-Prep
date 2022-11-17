class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs=new HashSet<>();
        for(String str:wordDict)
        {
            hs.add(str);
        }
        int n=s.length();
        int dp[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            // is problem solvable upto i
            for(int j=0;j<=i;j++)
            {
                // is problem already solved upto j-1 and if j to i is also solvable
                if((j==0||dp[j-1]==1) && hs.contains(s.substring(j,i+1)))
                {
                    dp[i]=1;
                }
            }
        }
        
        return dp[n-1]==1;
    }
}