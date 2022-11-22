class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        ans=[]
        
        rarr=[0]*n
        
        rarr[n-1]=1
        
        
        for i in range(n-2,-1,-1):
            rarr[i]=rarr[i+1]*nums[i+1]

        prev= 1
        ans.append(prev*rarr[0])
        
        for i in range(1,n):
            prev=prev*nums[i-1]
            ans.append(prev*rarr[i])
        
        return ans
        