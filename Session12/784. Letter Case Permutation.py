class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        self.s=s
        n=len(s)
        self.ans=[]
        self.helper(0,n)
        return self.ans
    
    def helper(self,pos,n):
        if pos>=n:
            self.ans.append(self.s)
            return
        
        if self.s[pos].isalpha():
            self.s=self.s[0:pos]+self.s[pos].upper()+self.s[pos+1:]
            self.helper(pos+1,n)
            self.s=self.s[0:pos]+self.s[pos].lower()+self.s[pos+1:]
            self.helper(pos+1,n)
        else:
            self.helper(pos+1,n)