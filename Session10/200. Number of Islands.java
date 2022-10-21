class Solution {
    int direction[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int m=grid.length;
         int n=grid[0].length;
         boolean[][] visited= new boolean[m][n];
         int noi=0;
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(grid[i][j]=='1')
                 {
                     dfs(i,j,visited,grid,m,n);
                     noi++;
                 }
             }
         }
        return noi;
    }
    
    void dfs(int x,int y,boolean[][] visited, char[][] grid,int m,int n)
    {
        for(int dir[]:direction)
            {
                int x1=x+dir[0];
                int y1=y+dir[1];
                if(x1>=0 && x1<m && y1>=0 && y1<n && grid[x1][y1]=='1')
                {
                    // visited[x1][y1]=true;
                    grid[x1][y1]='5';
                    dfs(x1,y1,visited,grid,m,n);
                }
            }
    }
}