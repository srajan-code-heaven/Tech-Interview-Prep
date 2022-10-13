class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        
        int start=0;
        char max_oc_char=s.charAt(0);
        int max_len_subs=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int end=0;end<n;end++)
        {
            char c=s.charAt(end);
            int curr_count=hm.getOrDefault(c,0);
            int new_count=curr_count+1;
            hm.put(c,new_count);
            if(new_count>hm.getOrDefault(max_oc_char,0))
            {
                max_oc_char=c;
            }
            
            if(end-start+1>hm.getOrDefault(max_oc_char,0) +k )
            {
                hm.put(s.charAt(start),hm.getOrDefault(s.charAt(start),0)-1);
                
                // Find the new Max
                   // for(char ch='A';ch<='Z';ch++)
                   //     {
                   //         if(hm.getOrDefault(ch,0)>hm.getOrDefault(max_oc_char,0))
                   //         {
                   //             max_oc_char=ch;
                   //         }
                   //     }
                
                // Iterate over HashMap
                for(Map.Entry<Character,Integer> e:hm.entrySet())
                {
                    if(e.getValue()>hm.getOrDefault(max_oc_char,0))
                    {
                        max_oc_char=e.getKey();
                    }
                }
                
                start++;
            }
            max_len_subs=Math.max(end-start+1,max_len_subs);
        }
        return max_len_subs;
    }
}