class Solution {
    List<Integer> temp=new ArrayList<>();
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        for(int i:nums)
        {
            temp.add(i);
        }
        permute_bctk(0,nums.length);
        return ans;
    }
    
    void permute_bctk(int pos, int n)
    {
        if(pos==n)
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=pos;i<n;i++)
        {
            Collections.swap(temp,pos,i);
            permute_bctk(pos+1,n);]
            Collections.swap(temp,i,pos);
        }
     
    }
}