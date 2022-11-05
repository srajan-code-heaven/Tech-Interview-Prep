class Solution {
    class TrieNode
    {
        TrieNode children[];
        boolean isEnd;
        public TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
    
    List<String> res;
    
    public void dfsWithPrefix(TrieNode curr,String prefix)
    {
        if(res.size()==3)
        {
            return;
        }
        
        if(curr.isEnd==true)
        {
            res.add(prefix);
        }
        
        for(char c='a';c<='z';c++)
        {
            if(curr.children[c-'a']!=null)
            {
                dfsWithPrefix(curr.children[c-'a'],prefix+c);
            }
        }
    }
    
    
    public List<String> getSearchResult(String prefix)
    {
       res=new ArrayList<String>();
        TrieNode curr=root;
        for(char p:prefix.toCharArray())
        {
            if(curr.children[p-'a']!=null)
            {
                curr=curr.children[p-'a'];
            }
            else
            {
                return new ArrayList<String>();
            }
        }
        dfsWithPrefix(curr,prefix);
        return res;
    }
    
    
    TrieNode root;
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        root=new TrieNode();
        List<List<String>> ans=new ArrayList<>();
        
        for(String product:products)
        {
            insert(product);
        }
        
        String prefix=new String();
        for(char w:searchWord.toCharArray())
        {
            prefix=prefix+w;
            ans.add(getSearchResult(prefix));
        }
      return ans;
    }
    
    public void insert(String word) {
    //System.out.println("ins");
    TrieNode curr=root;
    for(char w:word.toCharArray())
    {
        if(curr.children[w-'a']!=null)
        {
            curr=curr.children[w-'a'];
        }
        else
        {
            curr.children[w-'a']=new TrieNode();
            curr=curr.children[w-'a'];
        }
    }
    curr.isEnd=true;
    }
}