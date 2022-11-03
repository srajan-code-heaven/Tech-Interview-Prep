class Solution:
    def generateAbbreviations(self, word: str) -> List[str]:
        n=len(word)
        ans=[]
        temp=[]

        def helper(pos,k):
            nonlocal temp
            l=len(temp)
            if pos>=n:
                if k!=0:
                    temp.append(str(k))
                ans.append("".join(temp))
                temp=temp[0:l]
                return
            helper(pos+1,k+1)
            if k!=0:
                temp.append(str(k))
            temp.append(word[pos])
            helper(pos+1,0)
            temp=temp[0:l]
        helper(0,0)
        return ans