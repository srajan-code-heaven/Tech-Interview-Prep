class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        ans=[]
        for num in nums:
                    ind=abs(num)-1
                    if nums[ind]<0:
                        ans.append(abs(num))
                    nums[ind]=-nums[ind]

        for i in range(0, len(nums)):
            nums[i]=abs(nums[i])
        return ans