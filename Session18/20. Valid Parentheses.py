class Solution:
    def isValid(self, s: str) -> bool:
        dict={')':'(',']':'[','}':'{'}
        stack=[]
        for curr in s:
            if curr in dict:
                if len(stack)==0 or stack.pop()!=dict[curr]:
                    return False
            else:
                stack.append(curr)
        return len(stack)==0
              
                
                