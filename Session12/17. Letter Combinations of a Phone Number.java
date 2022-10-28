class Solution {
    List<String> ans=new ArrayList<>();
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        if(n==0)
        {
            return ans;
        }
        letterCombinations_rec(digits,0,n,new StringBuilder());
        return ans;
    }
    void letterCombinations_rec(String digits,int start,int n,StringBuilder temp)
    {
        if(start>=n)
        {
            ans.add(temp.toString());
            return;
        }
        int d=digits.charAt(start)-'0';
        for(char c:map[d].toCharArray())
        {
            temp.append(c);
            letterCombinations_rec(digits,start+1,n,temp);
         //   temp.delete(curr_ind,curr_ind+1);
            temp.setLength(temp.length()-1);
        }
    }
}