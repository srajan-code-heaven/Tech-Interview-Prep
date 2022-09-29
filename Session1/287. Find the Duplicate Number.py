class Solution:
    dup=-1
    def findDuplicate(self, nums: List[int]) -> int:
        for num in nums:
            ind=abs(num)-1
            if nums[ind]<0:
                dup= abs(num)
                break
            nums[ind]=-nums[ind]
        
        for i in range(0, len(nums)):
            nums[i]=abs(nums[i])
        return dup