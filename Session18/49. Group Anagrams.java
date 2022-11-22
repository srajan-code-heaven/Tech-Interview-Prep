class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            char carr[]=strs[i].toCharArray();
            Arrays.sort(carr);
            String temp=String.valueOf(carr);
            if(!hm.containsKey(temp))
            {
                hm.put(temp,new ArrayList<String>());
            }
            hm.get(temp).add(strs[i]);
        }
        return new ArrayList<List<String>>(hm.values());
    }
}