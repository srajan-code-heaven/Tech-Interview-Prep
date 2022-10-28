class Solution {
    List<String> ans=new ArrayList();
    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder(),0,0,n);
        return ans;
    }
    public void backtrack(StringBuilder curr,int open,int close,int max)
    {
        if(curr.length()==2*max)
        {
            ans.add(curr.toString());
        }
        if(open<max)
        {
            curr.append("(");
            backtrack(curr,open+1,close,max);
            curr.setLength(curr.length()-1);
        }
        if(close<open)
        {
            curr.append(")");
            backtrack(curr,open,close+1,max);
            curr.setLength(curr.length()-1);
        }
    }
}