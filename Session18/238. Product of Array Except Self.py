class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int larray[]=new int[n];
        int rarray[]=new int[n];
        larray[0]=1;
        for(int i=1;i<n;i++)
        {
            larray[i]=larray[i-1]*nums[i-1];
        }
        
        rarray[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            rarray[i]=rarray[i+1]*nums[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
            nums[i]=larray[i]*rarray[i];
        }
        
        return nums;
    }
}