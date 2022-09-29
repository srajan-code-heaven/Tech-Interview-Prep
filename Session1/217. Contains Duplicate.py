class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dicti={}
        
        for i in range(len(nums)):
            
            if nums[i] in dicti:
                return True
            
            else:
                dicti[nums[i]]=nums[i]
        return False
        