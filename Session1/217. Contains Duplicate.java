class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            if(hs.contains(num))
            {
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}