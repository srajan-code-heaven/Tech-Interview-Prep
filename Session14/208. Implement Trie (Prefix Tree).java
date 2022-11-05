class Trie {

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
    
    TrieNode root;
    public Trie() {
        root=new TrieNode();
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
    
    public boolean search(String word) {
        //System.out.println("sear");
         TrieNode curr=root;
        for(char w:word.toCharArray())
        {
             if(curr.children[w-'a']!=null)
            {
                curr=curr.children[w-'a'];
            }
            else
            {
                return false;
            }
        }
        
        if(curr.isEnd==true)
        {
            return true;
        }
        return false;
        //return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        System.out.println("stwith");
         TrieNode curr=root;
        for(char w:prefix.toCharArray())
        {
             if(curr.children[w-'a']!=null)
            {
                curr=curr.children[w-'a'];
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */