class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=0;
        
        int l=0,r=n-1;
        
        while(l<r)
        {
            int newarea=Math.min(height[l],height[r])*(r-l);
            ans=Math.max(ans,newarea);
            if(height[l]>height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        
        return ans;
    }
}