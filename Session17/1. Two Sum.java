class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int rem=target-nums[i];
            if(hm.containsKey(rem))
            {
                return new int[]{i,hm.get(rem)};
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}