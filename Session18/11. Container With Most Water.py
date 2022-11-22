class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        l=0
        r=len(height)-1
        maxamount=0
        
        while r>l:
            curramount= min(height[r],height[l])*(r-l)
            maxamount=max(maxamount,curramount)
            if height[r]<height[l]:
                r=r-1
            else:
                l=l+1
            
        return maxamount
        