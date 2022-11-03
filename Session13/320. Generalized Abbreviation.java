class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateAbbreviations(String word) {
       backtrack(0,new StringBuilder(),word,0);
        return ans;
    }
    
    public void backtrack(int pos,StringBuilder curr,String word,int bef_count)
    {
        if(pos==word.length())
        {
            if(bef_count!=0)
            {
                curr.append(String.valueOf(bef_count));
            }
            ans.add(curr.toString());
            return;
        }
        // Decision 1 - keep counting
        int len=curr.length();
        backtrack(pos+1,curr,word,bef_count+1);
        curr.setLength(len);
        
        // Decision 2 - Break counting, keep me as a character, start new counting from next position
        if(bef_count!=0)
        {
            curr.append(String.valueOf(bef_count));
        }
        curr.append(word.charAt(pos));
        backtrack(pos+1,curr,word,0);
        curr.setLength(len);
    }
}