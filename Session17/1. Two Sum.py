class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dicti={}
        for i in range(len(nums)):
            if target-nums[i] in dicti:
                return [dicti[target-nums[i]],i]
            if nums[i] not in dicti:
                dicti[nums[i]]=1