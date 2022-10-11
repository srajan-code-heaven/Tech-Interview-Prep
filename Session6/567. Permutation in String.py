class Solution:
    
    def checkInclusion(self, s1: str, s2: str) -> bool:
        def allZeros(arr):
            for k,v in arr.items():
                if v!=0:
                    return False
            return True
        
        n1=len(s1)
        n2=len(s2)
        
        if n1>n2:
            return False
        
        s1count={}
        
        for s in s1:
            if s in s1count:
                s1count[s]+=1
            else:
                s1count[s]=1
            
        for i in range(0,n1):
            if s2[i] in s1count:
                s1count[s2[i]]-=1
            else:
                s1count[s2[i]]=-1
        
        if allZeros(s1count):
            return True
            
        for i in range(n1,n2):
            s1count[s2[i-n1]]+=1
          
            if s2[i] in s1count:
                s1count[s2[i]]-=1
            else:
                s1count[s2[i]]=-1
                
            if allZeros(s1count):
                return True
        return False