class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        int n=strs.length;
        
        int maxiter=Math.min(strs[0].length(),strs[n-1].length());
        int i=0;
            
        while(i<maxiter)
        {
            if(strs[0].charAt(i)==strs[n-1].charAt(i))
            {
                i++;
            }
            else
            {
                break;
            }
        }
        
        return strs[0].substring(0,i);
    }
}