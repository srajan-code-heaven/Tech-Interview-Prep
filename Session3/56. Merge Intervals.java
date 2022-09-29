class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int n=intervals.length;
        
        int i=0;
        int j=1;
        
        while(j<n)
        {
            if(intervals[i][1]>=intervals[j][0])
            {
                intervals[i][1]=Math.max(intervals[i][1],intervals[j][1]);
                j++;
            }
            else
            {
                i++;
                intervals[i]=intervals[j];
                j++;
            }
        }
        
        int ans[][]=new int[i+1][2];
        
        for(int k=0;k<i+1;k++)
        {
            ans[k]=intervals[k];
        }
        
        return ans;
        
        
    }
}



class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}