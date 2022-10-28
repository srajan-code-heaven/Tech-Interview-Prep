class Solution {
    ArrayList<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        backtrack(s.toCharArray(),s.length(),0);
        return ans;
    }
    
    public void backtrack(char arr[],int n,int start)
    {
        if(start>=n)
        {
            ans.add(String.valueOf(arr));
            return;
        }
        if(Character.isAlphabetic(arr[start]))
        {
            arr[start]=Character.toLowerCase(arr[start]);
            backtrack(arr,n,start+1);
            arr[start]=Character.toUpperCase(arr[start]);
            backtrack(arr,n,start+1);
        }
        else
        {
            start++;
            backtrack(arr,n,start);
        }
    }
}