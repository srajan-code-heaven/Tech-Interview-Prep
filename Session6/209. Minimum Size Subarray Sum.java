class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        
        int st=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        
        for(int e=0;e<n;e++)
        {
            sum+=nums[e];
            
            if(sum>=target)
            {
                while(sum>=target)
                {
                    sum-=nums[st];
                    st++;
                }
                minLen=Math.min(minLen,e-st+2);
            }
        }
        
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}