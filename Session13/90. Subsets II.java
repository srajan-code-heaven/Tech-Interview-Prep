class Solution {
    List<List<Integer>> ans=new ArrayList<>();
public List<List<Integer>> subsetsWithDup(int[] nums) {
Arrays.sort(nums);
subsetsWithDup_bk(nums,new ArrayList<Integer>(),0,nums.length);
return ans;
}

public void subsetsWithDup_bk(int[] nums,List<Integer> temp,int pos,int n)
{
   if(pos==n)
    ans.add(new ArrayList<Integer>(temp));
    return;
}

// Decision 1 taking it 
temp.add(nums[pos]);
subsetsWithDup_bk(nums,temp,pos+1,n);
temp.remove(temp.size()-1);

// Decision 2 not taking it
while(pos+1<n && nums[pos]==nums[pos+1])
{
    pos++;
}
subsetsWithDup_bk(nums,temp,pos+1,n);
}
}