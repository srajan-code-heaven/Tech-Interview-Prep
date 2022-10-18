class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int directions[][]=new int[][]{
            {-1,0},{1,0},{0,1},{0,-1},{-1,1},{1,1},{-1,-1},{1,-1}
        };
        
        int n=grid.length;
        if(grid[0][0]==1)
        {
            return -1;
        }
        if(n==1)
        {
            return 1;
        }
    
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{0,0});
        int count=1;
        HashSet<int []> vis=new HashSet<>();
        vis.add(new int[]{0,0});
        grid[0][0]=1;
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                int curr[]=q.poll();
                for(int dir[]:directions)
                {
                    int x=curr[0]+dir[0];
                    int y=curr[1]+dir[1];
                    int neigh[]=new int[]{x,y};
                
                    
                          if(!(x<0 || x>=n || y<0 || y>=n || grid[x][y]==1))
                    {
                            if(x==n-1 && y==n-1)
                            {
                                return count+1;
                            }
                            q.add(neigh);
                            grid[x][y]=1;
                    }
                    
                }
            }
            count++;
        }
        return -1;
    }
}