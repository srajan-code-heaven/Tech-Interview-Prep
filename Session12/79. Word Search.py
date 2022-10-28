class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        self.directions=[[0,1],[0,-1],[-1,0],[1,0]]
        self.board=board
        m=len(board)
        n=len(board[0])
        start=0
        for i in range(m):
            for j in range(n):
                if self.bctrk(i,j,word,start,m,n):
                    return True
        return False
        
    def bctrk(self,i,j,word,start,m,n):
        if start>=len(word):
            return True
        if i>=0 and i<m and j>=0 and j<n and self.board[i][j]==word[start]:
            temp=self.board[i][j]
            self.board[i][j]='#'
            start+=1
            # for dir in self.directions:
            #     if(self.bctrk(board,i+dir[0],j+dir[1],word,start,m,n)):
            #         board[i][j]=temp
            #         return True
            # board[i][j]=temp
            # return False

            res= self.bctrk(i+1,j,word,start,m,n) or self.bctrk(i,j+1,word,start,m,n) or self.bctrk(i-1,j,word,start,m,n) or self.bctrk(i,j-1,word,start,m,n)
            self.board[i][j]=temp
            return res
        else:
            return False