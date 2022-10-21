class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      Queue<String> q=new LinkedList<>();
      HashSet<String> vis=new HashSet<>(wordList);
      q.add(beginWord);
      int seqLength=0;
       while(!q.isEmpty())
        {
            int s=q.size();
            seqLength+=1;
            for(int i=0;i<s;i++)
            {
                String curr=q.poll();
                for(String nei:findNeighbour(curr,vis))
                {
                    if(isValid(nei,vis))
                    {
                        if(nei.equals(endWord))
                        {
                            return seqLength+1;
                        }
                        vis.remove(nei);
                        q.add(nei);
                    }
                }
            }
        }
        
        return 0;
    }
    
        public boolean isValid(String nei,HashSet<String> vis)
        {
            if(vis.contains(nei))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
 
    
    public List<String> findNeighbour(String curr,HashSet<String> vis)
    {
        char[] curr_arr=curr.toCharArray();
        int n=curr_arr.length;
        List<String> neigh=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            char orig= curr_arr[i];
            for(char c='a';c<='z';c++)
            {
               curr_arr[i]=c;
                String nei=String.valueOf(curr_arr );
                if(vis.contains(nei))
                {
                    neigh.add(nei);
                }
            }
            curr_arr[i]=orig;
        }
        return neigh;
    }
}