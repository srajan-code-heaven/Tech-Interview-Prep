package Session3;
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []> ans=new ArrayList();
        int i=0,j=0;
        while(i<firstList.length && j< secondList.length)
        {
            int low=Math.max(firstList[i][0],secondList[j][0]);
            int high=Math.min(firstList[i][1],secondList[j][1]);
            if(low<=high)
            {
                ans.add(new int[]{low,high});
            }
            if(firstList[i][1]>secondList[j][1])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return ans.toArray(new int[0][]);
    }
}