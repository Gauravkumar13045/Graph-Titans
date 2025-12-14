
# Missing numbers

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n= len(nums)
        sums = n*(n+1)//2
        realsum = sum(nums)
        return sums - realsum 

        
