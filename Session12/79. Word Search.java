class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(backtrack(i,j,r,c,board,word,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean backtrack(int i,int j,int r,int c,char board[][],String word,int pos)
    {
        if(pos>=word.length())
        {
            return true;
        }
        if(i<0 || j<0 || i>=r || j>=c )
        {
            return false;
        }
        if(word.charAt(pos)!=board[i][j])
        {
            return  false;
        }
       char temp=board[i][j];
       board[i][j]=0;
       boolean res= backtrack(i+1,j,r,c,board,word,pos+1) || backtrack(i,j+1,r,c,board,word,pos+1) || backtrack(i-1,j,r,c,board,word,pos+1) || backtrack(i,j-1,r,c,board,word,pos+1);
       board[i][j]=temp;
       return res;
    }
}