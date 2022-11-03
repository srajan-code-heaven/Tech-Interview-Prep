class Solution {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> temp=new ArrayList<Integer>();
        backtrack(nums,temp,0,n);
        return ans;
    }
    void backtrack(int nums[],List<Integer> temp,int pos,int n)
    {
        if(pos==n)
        {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[pos]);
        backtrack(nums,temp,pos+1,n);
        temp.remove(temp.size()-1);
        backtrack(nums,temp,pos+1,n);
    }
}