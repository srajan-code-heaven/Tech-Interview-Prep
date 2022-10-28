class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        NumMap={"1":"","2":"abc","3":"def","4":"ghi","5":"jkl","6":"mno","7":"pqrs","8":"tuv", "9":"wxyz"}
        ans=[]
        temp=[]
        n=len(digits)
        if n==0:
            return ans
        
        def helper(pos):
            if pos>=n:
                ans.append("".join(temp))
                return
            
            for c in NumMap[digits[pos]]:
                temp.append(c)
                helper(pos+1)
                temp.pop(-1)
        
        helper(0)
        return ans
            
            
            