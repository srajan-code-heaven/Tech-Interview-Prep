class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        temp=[]
        ans=[]
        def helper(maxparan,open,close):
            if len(temp)>=2*maxparan:
                ans.append("".join(temp))
                return
            if open<maxparan:
                temp.append("(")
                helper(maxparan,open+1,close)
                temp.pop(-1)
            if close<open:
                temp.append(")")
                helper(maxparan,open,close+1)
                temp.pop(-1)
        
        helper(n,0,0)
        return ans