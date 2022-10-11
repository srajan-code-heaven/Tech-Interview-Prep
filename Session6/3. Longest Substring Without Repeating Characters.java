class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int lastSeen[]=new int[256];
        Arrays.fill(lastSeen,-1);
        int longsubs=0;
        
        if(n==0)
        {
            return 0;
        }
        
        int start=0;
        
        for(int end=0;end<n;end++)
        {
            char c=s.charAt(end);
            
            if(lastSeen[c]!=-1)
            {
                if(lastSeen[c]>=start)
                {
                    start=lastSeen[c]+1;
                }
            }
            lastSeen[c]=end;
            longsubs=Math.max(longsubs, end-start+1);
        }
        return longsubs;
        
    }
}