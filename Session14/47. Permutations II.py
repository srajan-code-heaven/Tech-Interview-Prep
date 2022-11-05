class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        n=len(nums)
        ans=[]
        hm={}
        for i in nums:
            hm[i]=hm.get(i,0)+1
        
        def permuteUnique_bktk(pos,curr):
            if pos==n:
                ans.append(curr[::])
                return
            
            for k,v in hm.items():
                if hm[k]>0:
                    curr.append(k)
                    hm[k]=hm[k]-1
                    permuteUnique_bktk(pos+1,curr)
                    curr.pop(-1)
                    hm[k]=hm[k]+1
        
        permuteUnique_bktk(0,[])
        return ans
        