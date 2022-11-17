class Solution {
    public int climbStairs(int n) {
        int t1=1,t2=1;
        for(int i=2;i<=n;i++)
        {
           int temp=t1;
           t1=t2+t1;
           t2=temp;
        }
        return t1;
    }
}