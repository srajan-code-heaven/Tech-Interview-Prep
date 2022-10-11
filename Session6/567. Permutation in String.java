class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(); // ab  = 2  
        int n2=s2.length(); // eidbaooo = 8
        
        if(n1>n2)
        {
            return false;
        }
                
        int s1count[]=new int[26];
        
        for(int i=0;i<n1;i++)
        {
            s1count[s1.charAt(i)-'a']++;
        }
        
        // add upto 0 to n1-1 elements
        for(int i=0;i<n1;i++)
        {
           s1count[s2.charAt(i)-'a']--;
        }
     // First time our window has sufficient elements to check = n1
        if(allZeros(s1count))
        {
            return true;
        }
        
        // ei
        
        // if not sliding my window
        // 1st iter rem 0 add n1
        // 2nd iter rem 1 add n1+1
        // 
        
        // id
        // all zeros
        
        // db
        // all zerox
        
        // ba
        // all zero true
        for(int i=n1;i<n2;i++)
        {
             s1count[s2.charAt(i-n1)-'a']++;
             s1count[s2.charAt(i)-'a']--;
             if(allZeros(s1count))
            {
                return true;
            }
        }
        
        return false;
        
    }
    
    
    boolean allZeros(int arr[])
    {
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}