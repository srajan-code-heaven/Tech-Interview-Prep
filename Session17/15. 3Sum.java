class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0) return ans;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++)
        {
            if((i==0|| nums[i-1]!=nums[i]) && nums[i]<=0)
            {
                twoSum(i,nums,n,ans);
            }
        }
        return ans;
    }
    
    void twoSum(int first,int[] nums,int n,List<List<Integer>> ans)
    {
        int l=first+1;
        int r=n-1;
        
        while(l<r)
        {
            int currSum=nums[first]+nums[l]+nums[r];
            if(currSum==0)
            {
                ans.add(Arrays.asList(nums[first],nums[l],nums[r]));
                while(l+1<n && nums[l+1]==nums[l])
                {
                    l++;
                }
                l++;
                r--;
            }
            else if(currSum>0)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
    }
}