class Solution {
    public int orangesRotting(int[][] grid) {
        int directions[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int []> q=new LinkedList<>();
        
        int m=grid.length;
        int n=grid[0].length;
        int freshCount=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1)
                {
                    freshCount++;
                }
            }
        }
        
        // if(freshCount==0)
        // {
        //     return 0;
        // }
        
        if(q.isEmpty())
        {
            System.out.println("here");
            return -1;
        }
        
        
        int minutes=0;
        
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                int[] curr=q.poll();
                for(int dir[]:directions)
                {
                    int x=curr[0]+dir[0];
                    int y=curr[1]+dir[1];
                    if(isValid(x,y,grid,m,n))
                    {
                        freshCount--;
                        grid[x][y]=2;
                        q.add(new int[]{x,y});
                    }
                }
            }
            minutes+=1;
        }
        
        return freshCount==0?minutes-1:-1;
    }
    
    public boolean isValid(int x,int y,int grid[][],int m,int n)
    {
        if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1)
        {
            return true;
        }
        return false;
    }
}